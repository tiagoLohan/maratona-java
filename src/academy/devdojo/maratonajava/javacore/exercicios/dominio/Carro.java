package academy.devdojo.maratonajava.javacore.exercicios.dominio;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int incremento) {
        System.out.println("O carro está acelerando em " + incremento + "km/h.");
        this.velocidadeAtual += incremento;
    }

    public void frear(int decremento) {
        System.out.println("O carro está freando " + decremento + "Km/h.");
        this.velocidadeAtual -= decremento;
    }

    public void exibirDetalhes() {
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Ano do carro: " + this.ano);
        System.out.println("Velocidade atual do carro: " + this.velocidadeAtual);
    }

}
