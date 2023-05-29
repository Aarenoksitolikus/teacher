package ru.itis.diploma.teacher.infrastructure.controllers.materials;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.diploma.teacher.api.http.lessons.rest.materials.MaterialsRest;

import java.util.List;

@RestController
public class MaterialsController implements MaterialsRest {
    @Override
    public ResponseEntity<String> get(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<String>> list(List<String> ids) {
        return null;
    }
}
