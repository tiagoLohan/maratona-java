package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    public static void main(String[] args) {

        String regex = "\\d+";
        String texto = "abasfwefewfd e5ef9 tiagolohan@gmail.com 4ef4ew4fe ababa teste@yahoo.com dddmqkmdkqwmd tiago@itau.com ffrwrqwqr54944";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
