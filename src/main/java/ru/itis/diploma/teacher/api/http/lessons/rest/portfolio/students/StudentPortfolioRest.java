package ru.itis.diploma.teacher.api.http.portfolio.students;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping(value = "/portfolio/students",
        produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Портфолио студентов")
public interface StudentPortfolioRest {

    @GetMapping(path = "/{id}")
    @Operation(description = "Возвращает портфолио конкретного студента")
    ResponseEntity<String> get(@PathVariable Long id);

    @GetMapping
    @Operation(description = "Возвращает список портфолио студентов")
    ResponseEntity<List<Long>> list(@RequestParam(required = false) List<String> ids);
}
