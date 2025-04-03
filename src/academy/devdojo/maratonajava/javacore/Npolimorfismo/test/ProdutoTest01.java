package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Produto computador = new Computador("Lenovo", 6000);
        Produto tomate = new Tomate("Tomate siciliano", 10);
        Produto televisao = new Televisao("LG", 5000);

        CalculadoraImposto.calcularImpostoProduto(computador);

        System.out.println("---------------");

        CalculadoraImposto.calcularImpostoProduto(tomate);

        System.out.println("---------------");

        CalculadoraImposto.calcularImpostoProduto(televisao);

        System.out.println(computador.getClass().getSimpleName());
    }
}
