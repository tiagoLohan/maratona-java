package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        int resto = 20 % 2;
        System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: "+isDezIgualVinte);
        System.out.println("isDezIgualDez: "+isDezIgualDez);
        System.out.println("isDezDiferenteDez: "+isDezDiferenteDez);

        int num = 10;
        boolean condicao = (num > 5) || (num > 11);
        System.out.println(condicao);

        double bonus = 1800;
        bonus += 1000;
        bonus -= 800;

        System.out.println(bonus);

        int cont = 0;
        for (int i = 0; i <= 5; i++){
            System.out.println(i);
        }

    }
}
