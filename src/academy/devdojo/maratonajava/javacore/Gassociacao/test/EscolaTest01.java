package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Girafalis");
        Professor professor2 = new Professor("Jiraya");
        Escola escola = new Escola("Konoha", new Professor[]{professor1, professor2});

        escola.imprime();
    }
}
