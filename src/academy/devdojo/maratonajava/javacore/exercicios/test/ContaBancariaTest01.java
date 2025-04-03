package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.ContaBancaria;

public class ContaBancariaTest01 {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Tiago Lohan");

        conta1.exibirSaldo();

        System.out.println("--------");

        conta1.sacar(30);
        conta1.exibirSaldo();

        System.out.println("--------");

        conta1.depositar(4000);
        conta1.exibirSaldo();
    }
}
