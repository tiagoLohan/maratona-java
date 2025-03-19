package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Tiago Lohan");
        funcionario.setIdade(34);
        funcionario.setSalarios(new double[]{2000, 3800, 7000});

        funcionario.imprimirDados();
        funcionario.mediaSalarios();

    }
}
