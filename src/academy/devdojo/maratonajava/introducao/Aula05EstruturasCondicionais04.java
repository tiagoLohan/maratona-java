package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 35000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double imposto;

        if (salario <= 34712) {
            imposto = salario * primeiraFaixa;
        } else if (salario >= 34713 && salario <= 68507) {
            imposto = salario * segundaFaixa;
        } else {
            imposto = salario * terceiraFaixa;
        }

        System.out.println(imposto);
    }

}
