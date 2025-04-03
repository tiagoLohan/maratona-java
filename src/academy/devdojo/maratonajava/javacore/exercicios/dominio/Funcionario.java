package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }
}
