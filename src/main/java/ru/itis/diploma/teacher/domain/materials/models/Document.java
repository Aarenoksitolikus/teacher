package ru.itis.diploma.teacher.domain.materials.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Document {

    private CommonInfo commonInfo;
    private List<File> files;

    @Getter
    @Setter
    @Builder
    public static class CommonInfo {
        private String title;
        private List<String> authors;
        private Stamp stamp;

        public enum Stamp {
            CLASSBOOK, LECTURES_SET, TUTORIAL, FINAL_QUALIFYING_WORK, RESEARCH_ARTICLE, TECHNICAL_ARTICLE
        }
    }

    @Getter
    @Setter
    @Builder
    public static class File {
        private String title;
        private byte[] data;
    }
}
