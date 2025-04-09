package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Test01 {

    public static void main(String[] args) {

        LocalDate dataEscolhida = LocalDate.of(2025, Month.APRIL, 22);
        System.out.println(verificarSemana(dataEscolhida));

    }

    public static DayOfWeek verificarSemana(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int diaMais = 0;

        switch (dayOfWeek) {
            case THURSDAY: diaMais = 4; break;
            case FRIDAY: diaMais = 3; break;
            case SATURDAY: diaMais = 2; break;
            default: diaMais = 1;
        }
        return date.plusDays(diaMais).getDayOfWeek();
    }

}

