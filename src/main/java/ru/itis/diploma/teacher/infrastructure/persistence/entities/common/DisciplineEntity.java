package ru.itis.diploma.teacher.infrastructure.persistence.entities.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule.Lesson;

import java.util.List;

@Getter
@Setter
@Entity
public class Discipline {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private List<Lesson> lessons;

}
