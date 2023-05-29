package ru.itis.diploma.teacher.infrastructure.services.materials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.diploma.teacher.domain.materials.models.Document;
import ru.itis.diploma.teacher.domain.materials.services.MaterialsService;
import ru.itis.diploma.teacher.infrastructure.persistence.repositories.materials.DocumentsRepository;

import java.util.List;

@Service
public class MaterialsServiceImpl implements MaterialsService {

    private final DocumentsRepository documentsRepository;

    @Autowired
    public MaterialsServiceImpl(DocumentsRepository documentsRepository) {
        this.documentsRepository = documentsRepository;
    }

    @Override
    public Document get(Long id) {
        return null;
    }

    @Override
    public List<Document> getList(List<Long> ids) {
        return null;
    }

    @Override
    public List<Document> getAll() {
        return null;
    }

    @Override
    public List<Document> getAllByAuthors(List<String> authors) {
        return null;
    }
}
