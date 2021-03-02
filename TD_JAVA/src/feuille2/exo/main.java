package feuille2.exo;
import feuille2.exo.cinq.Paire;
import feuille2.exo.deux.Ex2;
import feuille2.exo.quatre.Point;
import feuille2.exo.sept.Individu;
import feuille2.exo.six.Tri;
import feuille2.exo.trois.Ex3;
import feuille2.exo.un.Ex1;

import java.util.Scanner;

public class main {
    private static void main_one() {
        System.out.println("Exercice n°1 : Qu'affiche le programme ?");
        Scanner input = new Scanner(System.in);
        System.out.println("Appuyez sur Entrée pour afficher la réponse");
        while (!input.hasNextLine());
        Ex1.main();
    }

    private static void main_two() {
        System.out.println("Exercice n°2 : Qu'affiche le programme ?");
        Scanner input = new Scanner(System.in);
        System.out.println("Appuyez sur Entrée pour afficher la réponse");
        while (!input.hasNextLine());
        Ex2.main();
    }

    private static void main_three() {
        System.out.println("Exercice n°3 : Qu'affiche le programme ?");
        Scanner input = new Scanner(System.in);
        System.out.println("Appuyez sur Entrée pour afficher la réponse");
        while (!input.hasNextLine());
        Ex3.main();
    }

    private static void main_four() {
        Point p = new Point();
        System.out.println("Point généré sans argument à la construction :");
        p.affiche();
        boolean is_origin = p.origine();
        System.out.println("Le point est situé à l'origine du repère : " + is_origin);
        Point q = new Point(1,1);
        System.out.println("Nouveau point généré avec des arguments entiers :");
        q.affiche();
        boolean is_equal = p.egale(q);
        System.out.print("Les deux points sont égaux : " + is_equal + "\n");
        System.out.println("Création d'un nouveau point à partir du deuxième point :");
        Point t = new Point();
        t.set(q);
        t.affiche();
        System.out.println("Modification des coordonnées de ce dernier point :");
        t.set(42,-5);
        t.affiche();
        System.out.println("Création d'un nouveau point qui est son symétrique :");
        Point u = t.symetrie();
        u.affiche();
    }

    private static void main_five() {
        System.out.println("Création d'une paire sans argument :");
        Paire a = new Paire();
        System.out.println("Paire a = " + a.print());
        System.out.println("Création d'une paire avec argument :");
        Paire b = new Paire(78, 60);
        System.out.println("Paire b = " + b.print());
        System.out.println("Création d'une paire à partir d'une précédente :");
        Paire b_bis = new Paire(b);
        System.out.println("Paire b_bis = " + b_bis.print());
        System.out.println("Récupération des élements unitairement :");
        int b_1 = b.getX1();
        int b_2 = b.getY1();
        System.out.println("b(x) = " + b_1 + " | b(y) = " + b_2);
        System.out.println("Modification unitaire des élements de la paire b :");
        b.setX1(3);
        b.setY1(-273);
        System.out.println("Paire b = " + b.print());
    }

    private static void main_six() {
        System.out.println("Test de la fonction de comparaison de deux paires :");
        Paire a = new Paire(2, 3);
        Paire b = new Paire(3, 2);
        System.out.println("Paire a = " + a.print());
        System.out.println("Paire b = " + b.print());
        System.out.println("a < b = " + a.inferieur(b));

        System.out.print("Génération d'une liste de test :");
        int len = 5;
        Paire[] tab = new Paire[len];
        for (int i = len - 1; i >= 0; i--) {
            tab[len - i - 1] = new Paire(i, i);
        }
        System.out.print("Tableau non-trié : [" + tab[0].print());
        for (int i = 1; i < len; i++) {
            System.out.print(", " +tab[i].print());
        }
        System.out.println("Execution du tri à bulle...");
        int nb_comparaison = Tri.Tribulle(tab);
        System.out.println("Nombre de comparaison réalisé : " + nb_comparaison + "; Nombre d'élements : " + len);

        System.out.print("Tableau trié : [" + tab[0].print());
        for (int i = 1; i < len; i++) {
            System.out.print(", " +tab[i].print());
        }

        for (int i = len - 1; i >= 0; i--) {
            tab[len - i - 1].set(new Paire(i, i));
        }
        System.out.print("Tableau non-trié : [" + tab[0].print());
        for (int i = 1; i < len; i++) {
            System.out.print(", " +tab[i].print());
        }
        System.out.println("Execution du tri par insertion...");
        nb_comparaison = Tri.TriInsertion(tab);
        System.out.println("Nombre de comparaison réalisé : " + nb_comparaison + "; Nombre d'élements : " + len);

        System.out.print("Tableau trié : [" + tab[0].print());
        for (int i = 1; i < len; i++) {
            System.out.print(", " +tab[i].print());
        }

        for (int i = len - 1; i >= 0; i--) {
            tab[len - i - 1].set(new Paire(i, i));
        }
        System.out.print("Tableau non-trié : [" + tab[0].print());
        for (int i = 1; i < len; i++) {
            System.out.print(", " +tab[i].print());
        }
        System.out.println("Execution du tri par fusion...");
        nb_comparaison = Tri.TriFusion(tab);
        System.out.println("Nombre de comparaison réalisé : " + nb_comparaison + "; Nombre d'élements : " + len);

        System.out.print("Tableau trié : [" + tab[0].print());
        for (int i = 1; i < len; i++) {
            System.out.print(", " +tab[i].print());
        }
    }

    private static void main_seven() {
        Individu ind1 = new Individu("Hyperion", "OVH Cloud", "0142861578");
        Individu ind2 = new Individu("Atlas", "Alls-Heberg", "0237853680");
        Individu ind3 = new Individu("Dahl", "Hostinger", "0142861578");
        System.out.println(ind1);
        System.out.println(ind2);
        System.out.println(ind3);
        System.out.println(ind1.getInstance_list());
    }

    public static void main(String[] args) {
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
        /* Si le switch ne fonctionne pas (syntax error) remplacez-le par celui-ci :*/
        /*
        switch (numero) {
            case 1 :
                main_one();
                break;
            case 2 :
                main_two();
                break;
            case 3 :
                main_three();
                break;
            case 4 :
                main_four();
                break;
            case 5 :
                main_five();
                break;
            case 6:
                main_six();
                break;
            case 7:
                main_seven();
                break;
        }
         */
    }
}
