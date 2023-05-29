package ru.itis.diploma.teacher.infrastructure.persistence.entities.common;

import jakarta.persistence.*;
import lombok.*;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule.Course;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule.Lesson;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

}
