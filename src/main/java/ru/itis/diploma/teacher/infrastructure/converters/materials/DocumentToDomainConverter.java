package ru.itis.diploma.teacher.infrastructure.converters.materials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.diploma.teacher.domain.materials.models.Document;
import ru.itis.diploma.teacher.infrastructure.converters.schedule.CommonConverter;
import ru.itis.diploma.teacher.infrastructure.exceptions.BusinessException;
import ru.itis.diploma.teacher.infrastructure.exceptions.FileContentException;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.documents.DocumentEntity;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.documents.FileEntity;
import ru.itis.diploma.teacher.infrastructure.persistence.repositories.materials.FilesRepository;
import ru.itis.diploma.teacher.infrastructure.utils.FileExtractor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class DocumentToDomainConverter implements CommonConverter<DocumentEntity, Document> {

    private final FilesRepository filesRepository;
    private final FileExtractor fileExtractor;

    @Autowired
    public DocumentToDomainConverter(FilesRepository filesRepository, FileExtractor fileExtractor) {
        this.filesRepository = filesRepository;
        this.fileExtractor = fileExtractor;
    }

    @Override
    public Document convert(DocumentEntity source) {
        if (Objects.isNull(source)) return null;
        return Document.builder()
                .commonInfo(Document.CommonInfo.builder()
                        .title(source.getTitle())
                        .stamp(source.getStamp())
                        .authors(source.getAuthors())
                        .build())
                .files(convertFiles(filesRepository.findByDocument_Id(source.getId())))
                .build();
    }

    private Document.File convertFile(FileEntity fileEntity) throws FileContentException {
        return Document.File.builder()
                .title(fileEntity.getTitle())
                .data(fileExtractor.getFileContent(fileEntity.getFilePath()))
                .build();
    }

    private List<Document.File> convertFiles(List<FileEntity> fileEntities) {
        List<Document.File> result = new ArrayList<>();
        try {
            for (FileEntity fileEntity : fileEntities) {
                result.add(convertFile(fileEntity));
            }
            return result;
        } catch (FileContentException e) {
            throw new BusinessException(e);
        }
    }
}
