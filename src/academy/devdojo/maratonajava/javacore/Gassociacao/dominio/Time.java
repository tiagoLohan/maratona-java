package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {

    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public void imprimir() {
        System.out.println(this.nome);
        if (this.jogadores == null) {
            return;
        }
        for (Jogador jogador: this.jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
