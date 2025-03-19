package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados() {
        System.out.println("--------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double sal: this.salarios) {
            System.out.print(sal + " ");
        }
    }

    public void mediaSalarios() {
        for (double sal: this.salarios) {
            this.media += sal;
        }
        media /= this.salarios.length;
        System.out.println("\nMédia dos salários: " + media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
