package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        int[] idades = new int[3];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i + 1;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
