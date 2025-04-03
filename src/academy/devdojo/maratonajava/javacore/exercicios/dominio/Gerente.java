package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Bônus: " + this.bonus);
    }
}
