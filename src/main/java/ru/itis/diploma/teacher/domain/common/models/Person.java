package ru.itis.diploma.teacher.domain.common.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public abstract class Person {
    protected Person.CommonInfo commonInfo;

    @Getter
    @Setter
    @Builder
    public static class CommonInfo {
        private String lastName;
        private String firstName;
        private String secondName;

    }
}
