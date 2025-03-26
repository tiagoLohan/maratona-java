package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desevolvedor extends Funcionario {

    public Desevolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desevolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
