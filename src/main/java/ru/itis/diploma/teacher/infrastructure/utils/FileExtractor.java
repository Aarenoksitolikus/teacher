package ru.itis.diploma.teacher.infrastructure.utils;

import org.springframework.stereotype.Component;
import ru.itis.diploma.teacher.infrastructure.exceptions.FileContentException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
public class FileExtractor {
    public byte[] getFileContent(String pathToFile) throws FileContentException {
        try {
            File file = new File(pathToFile);
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            throw new FileContentException();
        }
    }
}
