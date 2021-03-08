import java.util.Scanner;


public class main {
    private static void main_one() {
        System.out.println("Feuille TD 1 :");
        feuille1.exo.un.main.main();
    }

    private static void main_two() {
        System.out.println("Feuille TD 2 :");
        feuille2.exo.main.main();
    }

    private static void main_three() {
        System.out.println("Feuille TD 3 :");
        feuille3.exo.main.main();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        System.out.println("Choisissez quel exercice souhaitez-vous tester (nombre entre 1 et 3) :");
        while (numero < 1 || numero > 3) {
            numero = input.nextInt();
        }
        switch (numero) {
            case 1 -> main_one();
            case 2 -> main_two();
            case 3 -> main_three();
        }
    }
}
