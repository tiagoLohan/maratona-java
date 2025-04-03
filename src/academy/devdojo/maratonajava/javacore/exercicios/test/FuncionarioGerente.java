package academy.devdojo.maratonajava.javacore.exercicios.test;

import academy.devdojo.maratonajava.javacore.exercicios.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.exercicios.dominio.Gerente;

public class FuncionarioGerente {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Diego", 5000);
        Gerente gerente = new Gerente("Tiago Lohan", 16000, 3000);

        funcionario.exibirDados();

        System.out.println("---");

        gerente.exibirDados();
    }
}
