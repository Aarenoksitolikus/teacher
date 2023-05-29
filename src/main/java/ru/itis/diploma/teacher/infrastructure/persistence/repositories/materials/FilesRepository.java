package ru.itis.diploma.teacher.infrastructure.persistence.repositories.materials;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.documents.FileEntity;

import java.util.List;

@Repository
public interface FilesRepository extends JpaRepository<FileEntity, Long> {
    List<FileEntity> findByDocument_Id(Long id);
}
