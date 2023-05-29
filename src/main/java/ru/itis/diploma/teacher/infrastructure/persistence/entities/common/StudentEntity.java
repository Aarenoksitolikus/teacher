package ru.itis.diploma.teacher.infrastructure.persistence.entities.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
