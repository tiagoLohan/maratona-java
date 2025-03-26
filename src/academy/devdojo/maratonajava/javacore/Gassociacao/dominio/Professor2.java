package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor2 {

    private String nome;
    private int idade;
    private Seminario[] seminarios;

    public Professor2(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminarios == null) {
            return;
        }
        for (Seminario seminario: this.seminarios) {
            System.out.println("Seminário: " + seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return this.seminarios;
    }
}
