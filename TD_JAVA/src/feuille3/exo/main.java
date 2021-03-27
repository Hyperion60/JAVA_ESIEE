package feuille3.exo;

import feuille3.exo.cinq.Bibliothèque;
import feuille3.exo.deux.Etudiant;
import feuille3.exo.deux.Individu;
import feuille3.exo.quatre.TestEtudiant;

import java.util.Scanner;

public class main {
    private static void main_one() {
        System.out.println("Exercice n°1 : Qu'affiche le programme ?");
        Scanner input = new Scanner(System.in);
        System.out.println("Appuyez sur Entrée pour afficher la réponse");
        while (!input.hasNextLine());
        feuille3.exo.un.Test.main();
    }

    private static void main_two() {
        System.out.println("Exercice n°2\nCréation d'un individu et d'un étudiant");
        Individu i = new Individu("Hyperion", "OVH Cloud");
        Etudiant e = new Etudiant("Atlas", "Alls-Heberg", "Ingénieur");
        System.out.print("Individu : ");
        i.affiche();
        System.out.print("Etudiant : ");
        e.affiche();
    }

    private static void main_three() {
        System.out.println("Exercice n°3 : Qu'affiche le programme ?");
        Scanner input = new Scanner(System.in);
        System.out.println("Appuyez sur Entrée pour afficher la réponse");
        while (!input.hasNextLine());
        feuille3.exo.trois.Test.main();
    }

    private static void main_four() {
        System.out.println("Exercice n°4");
        TestEtudiant.main();
    }

    private static void main_five() {
        System.out.println("Exercice n°5");
        Bibliothèque.main();
    }

    private static void main_six() {
        System.out.println("Exercice n°7");
        feuille3.exo.six.Test.main();
    }

    private static void main_seven() {
        System.out.println("Exercice n°7");
        feuille3.exo.sept.Histoire.main();
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        int numero = -1;
        System.out.println("Choisissez quel exercice souhaitez-vous tester (nombre entre 1 et 7) :");
        while (numero < 1 || numero > 7) {
            numero = input.nextInt();
        }
        switch (numero) {
            case 1 -> main_one();
            case 2 -> main_two();
            case 3 -> main_three();
            case 4 -> main_four();
            case 5 -> main_five();
            case 6 -> main_six();
            case 7 -> main_seven();
        }
    }
}
