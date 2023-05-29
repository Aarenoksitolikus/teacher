package ru.itis.diploma.teacher.infrastructure.converters.materials;

import org.springframework.stereotype.Component;
import ru.itis.diploma.teacher.domain.materials.models.Document;
import ru.itis.diploma.teacher.infrastructure.converters.schedule.CommonConverter;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.documents.DocumentEntity;

@Component
public class DocumentToDomainConverter implements CommonConverter<DocumentEntity, Document> {
}
