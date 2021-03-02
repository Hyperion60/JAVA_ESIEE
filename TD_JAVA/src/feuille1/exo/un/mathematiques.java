package feuille1.exo.un;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;


public class mathematiques {

    /* Fonction pour addition les n premier entiers pairs
    Pour n = 5, on doit avoir 2 + 4 + 6 + 8 + 10 = 30
    soit n * 2 + (n - 1) * 2 + (n - 2) * 2 + (n - 3) * 2 + (n - 4) * 2 = 30
     */
    private static int even_sum(int n) {
        int sum = 0;
        for (int i = n; i != 0; --i) {
            sum += i * 2;
        }
        return sum;
    }

    private static int[] decompose(int n) {
        int len = 1; // Longueur du nombre
        if (n > 9) { // Soit longueur > 1
            /* Augmente la longueur jusqu'à que le quotient entier de n / 10^^len soit nul */
            while ((int) (n / Math.pow(10, ++len)) != 0);
        }
        /* En utilisant des fonctions intégrés à JAVA on peut également définir la longueur ainsi :
        int len = String.valueOf(n).length();
        On convertit le nombre en chaine de charactère avec "String.valueOf(n)" auquel on mesure sa
        longueur avec la méthode "length()"
         */

        int[] output = new int[len]; // Initialisation d'un tableau d'entier de longueur len
        int reste = n;
        for (int i = len - 1; i != 0; --i) {
            output[len - 1 - i] = (int)(reste / Math.pow(10, i));
            reste %= Math.pow(10, i); // Calcul du reste de la division
        }
        output[len - 1] = reste;
        System.out.println("Décomposion of " + n + " by 10: " + Arrays.toString(output));
        return output;
    }

    private static long fact_n(int n) {
        long prod = 1; // Les nombres de tailles integers sont trop petit en prend du long
        for (int i = n; i != 0; --i) {
            prod *= i;
        }
        return prod;
    }
}
