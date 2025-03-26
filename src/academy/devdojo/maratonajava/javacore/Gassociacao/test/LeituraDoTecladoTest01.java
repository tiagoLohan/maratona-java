package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Agora digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
    }
}
