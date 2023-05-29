package ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule;

import jakarta.persistence.*;
import lombok.*;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.common.Teacher;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
}
