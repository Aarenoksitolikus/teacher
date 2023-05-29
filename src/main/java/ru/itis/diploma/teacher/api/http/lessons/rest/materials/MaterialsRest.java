package ru.itis.diploma.teacher.api.http.lessons.materials;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/materials",
        produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Учебно-методические материалы")
public interface MaterialsRest {

    @GetMapping(path = "/{id}")
    @Operation(description = "Возвращает конкретный учебно-методический материал")
    ResponseEntity<String> get(@PathVariable Long id);

    @GetMapping
    @Operation(description = "Возвращает список учебно-методических материалов")
    ResponseEntity<List<String>> list(@RequestParam(required = false) List<String> ids);
}
