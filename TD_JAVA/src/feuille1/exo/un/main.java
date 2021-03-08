package feuille1.exo.un;

import java.util.Scanner;

public class main {

    private static void main_one() {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        System.out.println("Entrez un nombre pour le calcul de la somme :");
        while (numero < 0) {
            numero = input.nextInt();
        }
        System.out.println("Somme des entiers paires de 0 à " + numero + " = " + mathematiques.even_sum(numero));
    }

    private static void main_two() {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        System.out.println("Entrez un nombre pour la décomposition :");
        while (numero < 0) {
            numero = input.nextInt();
        }
        mathematiques.decompose(numero);
    }

    private static void main_three() {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        System.out.println("Entrez un nombre pour le calcul du factoriel :");
        while (numero < 0) {
            numero = input.nextInt();
        }
        System.out.println("Factoriel de " + numero + " = " + mathematiques.fact_n(numero));
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        System.out.println("Choisissez la fonction à tester :");
        System.out.println("1 : Somme des entiers paires");
        System.out.println("2 : Décomposition d'un entier en tableau");
        System.out.println("3 : Factoriel");

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
