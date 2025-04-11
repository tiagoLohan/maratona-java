package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class teste {

    public static void main(String[] args) {

        File file = new File("testandoBloco.txt");
        String meuNome = "Tiago Lohan";

        try {
            FileWriter fw = new FileWriter(file);
            for (char letra : meuNome.toCharArray()) {
                fw.write(letra + "\n");
            }

            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
