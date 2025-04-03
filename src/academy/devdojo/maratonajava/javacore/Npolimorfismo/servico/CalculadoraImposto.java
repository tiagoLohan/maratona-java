package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto.");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome() + " - Imposto: " + imposto);
    }
}
