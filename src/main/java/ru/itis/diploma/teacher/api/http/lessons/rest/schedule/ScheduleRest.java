package ru.itis.diploma.teacher.api.http.lessons.rest.schedule;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.diploma.teacher.domain.schedule.models.Lesson;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

@RequestMapping(value = "/schedule",
        produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Расписание")
public interface ScheduleRest {

    @GetMapping
    @Operation(description = "Возвращает расписание занятий в указанном промежутке времени")
    ResponseEntity<List<Lesson>> get(@RequestParam OffsetDateTime from, @RequestParam OffsetDateTime to);
}
