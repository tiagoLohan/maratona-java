package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

    public static void main(String[] args) {

        LocalDateTime aniversario = LocalDateTime.of(1990, Month.APRIL, 8, 17, 00, 00);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(ChronoUnit.YEARS.between(aniversario, now));
    }

}
