package ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.common.Teacher;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.tasks.Task;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String title;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<Task> tasks;

}
