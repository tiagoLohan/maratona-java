package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + this.local.getEndereco());
        if (this.alunos == null) {
            return;
        }
        for (Aluno aluno: this.alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
