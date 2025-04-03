package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto1 = new Computador("Rayzer", 3500);
        Produto produto2 = new Tomate("Cereja", 15);

        System.out.println(produto1.getNome());
        System.out.println(produto1.calcularImposto());

        System.out.println();

        System.out.println(produto2.getNome());
        System.out.println(produto2.calcularImposto());

    }
}
