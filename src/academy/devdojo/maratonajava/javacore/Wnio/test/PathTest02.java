package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {

    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
            System.out.println("Pasta criada!");
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaSubDiectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
            System.out.println("Arquivo criado!");
        }

        Path source = filePath;
        Path target = Paths.get(subPastaSubDiectory.toString(), "file_renamed.txt");
        Files.copy(source, target);
    }
}
