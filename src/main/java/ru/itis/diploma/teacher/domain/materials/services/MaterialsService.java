package ru.itis.diploma.teacher.domain.materials.services;

import ru.itis.diploma.teacher.domain.materials.models.Document;

import java.util.List;

public interface MaterialsService {
    Document get(Long id);

    List<Document> getList(List<Long> ids);

    List<Document> getAll();

    List<Document> getAllByAuthors(List<String> authors);
}
