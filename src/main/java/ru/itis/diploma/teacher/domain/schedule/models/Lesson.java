package ru.itis.diploma.teacher.domain.schedule.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@Builder
public class Lesson {
    private String title;
    private OffsetDateTime date;
}
