package ru.itis.diploma.teacher.domain.common.models;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Tag(name = "Студент")
public class Student extends Person {
    private Person.CommonInfo commonInfo;
}
