package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akaduma", "TV", 12);
        anime.init("Akaduma 2", "TV", 12, "Ação");
        anime.imprime();
    }
}
