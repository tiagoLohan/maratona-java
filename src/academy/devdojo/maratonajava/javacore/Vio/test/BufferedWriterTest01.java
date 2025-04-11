package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {

    public static void main(String[] args) {

        File file = new File("file.txt");
        try {
            FileWriter fr = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write("Tudo vai dar certo, pois tenho um Deus que tudo faz! AMÉM!");
            bw.newLine();
            bw.write("JESUS É MARAVILHOSO !!!!!!!! ❤🙏");
            bw.newLine();
            bw.flush();

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
