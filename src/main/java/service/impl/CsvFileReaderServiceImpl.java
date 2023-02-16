package service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import service.CsvFileReaderService;

public class CsvFileReaderServiceImpl implements CsvFileReaderService {
    @Override
    public List<String> readFromFile(String filePath) {
        try {
            return Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException(
                    "Can't read file by path: " + filePath, e);
        }
    }
}


