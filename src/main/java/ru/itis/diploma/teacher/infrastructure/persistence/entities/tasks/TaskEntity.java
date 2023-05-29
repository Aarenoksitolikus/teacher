package ru.itis.diploma.teacher.infrastructure.persistence.entities.tasks;

import jakarta.persistence.*;
import lombok.*;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule.Course;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "task")
public class Task {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;
    private 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
}
