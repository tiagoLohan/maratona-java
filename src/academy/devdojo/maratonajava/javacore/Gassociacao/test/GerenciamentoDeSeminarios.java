package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor2;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciamentoDeSeminarios {

    public static void main(String[] args) {

        Local local1 = new Local("Duque de Caxias");
        Seminario seminario1 = new Seminario("Engenharia de Software", local1);
        Seminario seminario2 = new Seminario("Trabalho na Gringa", local1);
        Aluno aluno1 = new Aluno("Tiago Lohan", 30);
        Aluno aluno2 = new Aluno("Matheus", 30);
        Professor2 professor1 = new Professor2("Souza", 32);

        aluno1.setSeminario(seminario1);
        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
        professor1.setSeminarios(new Seminario[]{seminario1, seminario2});
        seminario1.setLocal(local1);

        System.out.println();
        System.out.println("--- SEMINARIO ---");
        seminario1.imprimir();
        System.out.println();

        System.out.println("--- ALUNOS ---");
        aluno1.imprimir();
        System.out.println();

        System.out.println("--- PROFESSOR ---");
        professor1.imprimir();





    }
}
