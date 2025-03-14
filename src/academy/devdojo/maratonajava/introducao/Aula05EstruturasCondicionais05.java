package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        byte dia = 8;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida");
        }

        char sexo = 'O';

        switch (sexo) {
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            case 'F':
                System.out.println("Sexo Feminino");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
