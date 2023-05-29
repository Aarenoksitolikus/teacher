package ru.itis.diploma.teacher.domain.portfolio.models;

import io.swagger.v3.oas.annotations.tags.Tag;
import ru.itis.diploma.teacher.domain.syllabus.models.Syllabus;

@Tag(name = "Портфолио")
public abstract class Portfolio {
    private Syllabus syllabus;
}
