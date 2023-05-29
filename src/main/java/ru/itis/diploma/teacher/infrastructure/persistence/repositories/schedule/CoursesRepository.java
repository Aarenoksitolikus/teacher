package ru.itis.diploma.teacher.infrastructure.persistence.repositories.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.diploma.teacher.infrastructure.persistence.entities.schedule.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
