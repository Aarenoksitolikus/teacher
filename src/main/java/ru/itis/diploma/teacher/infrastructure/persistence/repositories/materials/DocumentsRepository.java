package ru.itis.diploma.teacher.infrastructure.persistence.repositories.materials;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.documents.DocumentEntity;

@Repository
public interface DocumentsRepository extends JpaRepository<DocumentEntity, Long> {
}
