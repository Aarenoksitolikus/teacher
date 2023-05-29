package ru.itis.diploma.teacher.infrastructure.persistence.entities.documents;

import jakarta.persistence.*;
import lombok.*;
import ru.itis.diploma.teacher.domain.materials.models.Document;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "document")
public class DocumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private List<String> authors;

    @Enumerated(value = EnumType.ORDINAL)
    private Document.CommonInfo.Stamp stamp;

    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY)
    private FileEntity file;

    private OffsetDateTime deletedAt;
}
