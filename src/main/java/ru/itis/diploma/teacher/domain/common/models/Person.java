package ru.itis.diploma.teacher.domain.common.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public abstract class Person {
    private CommonInfo commonInfo;

    @Getter
    @Setter
    @Builder
    public static class CommonInfo {
        private String lastName;
        private String firstName;
        private String secondName;
    }
}
