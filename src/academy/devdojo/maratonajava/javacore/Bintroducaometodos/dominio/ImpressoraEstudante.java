package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprimeEstudante(Estudante est) {

        System.out.println("-------------------------");

        System.out.println(est.nome);
        System.out.println(est.idade);
        System.out.println(est.sexo);
    }
}
