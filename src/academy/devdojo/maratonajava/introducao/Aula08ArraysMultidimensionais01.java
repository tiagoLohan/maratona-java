package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        String[][] nomes = new String[3][2];

        nomes[2][1] = "Tiago";

//        for (int i = 0; i < nomes.length; i++) {
//            for (int j = 0; j < nomes[i].length; j++) {
//                System.out.println(nomes[i][j]);
//            }
//        }

        for (String[] array : nomes) {
            for (String nome : array) {
                System.out.println(nome);
            }
        }


//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 11; j++) {
//                System.out.println(i+" x "+j+" = "+i*j);
//            }
//            System.out.println();

    }
}
