package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat01 {

    public static void main(String[] args) {

        String pattern = "'Duque de Caxias' dd 'de' MMMM 'de' YYYY";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String data = sdf.format(new Date());

        System.out.println(data);

    }
}
