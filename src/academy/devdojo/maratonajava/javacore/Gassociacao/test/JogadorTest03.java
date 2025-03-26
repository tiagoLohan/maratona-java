package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {

    public static void main(String[] args) {

        Jogador jogagor = new Jogador("Kafu");
        Jogador jogagor2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        jogagor.setTime(time);
        jogagor2.setTime(time);
        time.setJogadores(new Jogador[]{jogagor, jogagor2});

        System.out.println("--- Jogador ---");
        jogagor.imprime();
        jogagor2.imprime();

        System.out.println("--- Time ---");
        time.imprimir();

    }
}
