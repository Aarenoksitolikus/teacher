package ru.itis.diploma.teacher.api.http.portfolio.teacher;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/portfolio/teacher")
public class TeacherPortfolioController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getPortfolio(@PathVariable Long id) {
        return ResponseEntity.ok(id.toString());
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> updatePortfolio(@PathVariable Long id, String string) {
        return ResponseEntity.ok(id.toString() + string);
    }
}
