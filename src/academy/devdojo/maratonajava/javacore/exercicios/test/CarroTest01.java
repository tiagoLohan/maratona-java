package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {

        Carro carro = new Carro("Sandero", "Stapway", 2016, 57);
        carro.acelerar(15);
        carro.exibirDetalhes();

        System.out.println();

        carro.frear(22);
        carro.exibirDetalhes();
    }
}
