package ru.itis.diploma.teacher.infrastructure.persistence.entities.tasks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "work")
public class Work {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}
