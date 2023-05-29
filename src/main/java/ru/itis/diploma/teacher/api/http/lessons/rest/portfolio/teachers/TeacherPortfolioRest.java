package ru.itis.diploma.teacher.api.http.lessons.rest.portfolio.teachers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/portfolio/teachers",
        produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Портфолио преподавателей")
public interface TeacherPortfolioRest {

    @GetMapping(path = "/{id}")
    @Operation(description = "Возвращает портфолио конкретного преподавателя")
    ResponseEntity<String> get(@PathVariable Long id);

    @GetMapping
    @Operation(description = "Возвращает список портфолио преподавателей")
    ResponseEntity<List<String>> list(@RequestParam(required = false) List<String> ids);

    @PostMapping(path = "/{id}")
    @Operation(description = "Обновляет портфолио преподавателя")
    ResponseEntity<String> update(@PathVariable Long id, @RequestParam String string);
}
