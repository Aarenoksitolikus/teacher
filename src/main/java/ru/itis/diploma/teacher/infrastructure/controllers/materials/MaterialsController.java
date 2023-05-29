package ru.itis.diploma.teacher.infrastructure.controllers.materials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.diploma.teacher.api.http.lessons.rest.materials.MaterialsRest;
import ru.itis.diploma.teacher.domain.materials.models.Document;
import ru.itis.diploma.teacher.domain.materials.services.MaterialsService;

import java.util.List;
import java.util.Objects;

@RestController
public class MaterialsController implements MaterialsRest {

    private final MaterialsService materialsService;

    @Autowired
    public MaterialsController(MaterialsService materialsService) {
        this.materialsService = materialsService;
    }

    @Override
    public ResponseEntity<Document> get(Long id) {
        return ResponseEntity.ok(materialsService.get(id));
    }

    @Override
    public ResponseEntity<List<Document>> list(List<Long> ids) {
        return ResponseEntity.ok(Objects.isNull(ids) ? materialsService.getAll() : materialsService.getList(ids));
    }
}
