package ss18.thuchanh.service;

import java.util.List;

public interface IReadWriteFile {
    List<String> readFile(String path);
void WriteFile(String path);
}
