package ru.itis.diploma.teacher.infrastructure.persistence.entities.documents;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "file")
public class FileEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "path", nullable = false)
    private String filePath;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "volume", nullable = false)
    private Long volume;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "document_id")
    private DocumentEntity document;

    private OffsetDateTime deletedAt;
}
