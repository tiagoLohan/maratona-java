package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
    }

    public void exibirSaldo() {
        System.out.println("Seu saldo atual é de R$" + this.saldo);
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 50;
    }
}
