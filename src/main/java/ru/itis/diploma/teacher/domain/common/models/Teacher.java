package ru.itis.diploma.teacher.domain.common.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.itis.diploma.teacher.domain.schedule.models.Lesson;

import java.util.List;

@Getter
@Setter
@Builder
public class Teacher extends Person {

    protected Person.CommonInfo commonInfo;
    private List<Lesson> lessons;
}
