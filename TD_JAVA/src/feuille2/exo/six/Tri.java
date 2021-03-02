package feuille2.exo.six;

import feuille2.exo.cinq.Paire;

import java.lang.reflect.Parameter;


public class Tri {

    public static int Tribulle(Paire[] tab) {
        boolean is_sorted = false;
        int len = tab.length;
        int nb_comparaison = 0;
        while (!is_sorted) {
            is_sorted = true;
            for (int i = 0; i < len - 1; ++i) {
                nb_comparaison++;
                if (!tab[i].inferieur(tab[i + 1])) {
                    is_sorted = false;
                    Paire tmp = new Paire(tab[i]); // Defini une paire via la ième paire
                    tab[i].set(tab[i + 1]); // Ecrase le ième élement par le (i + 1)eme
                    tab[i + 1].set(tmp); // Ecrase le (i + 1)ème element par tmp (=ième)
                }
            }
        }
        return nb_comparaison;
    }

    public static int TriInsertion(Paire[] tab) {
        int nb_comparaison = 1;
        int len = tab.length;
        Paire key = new Paire();
        for (int i = 1; i < len; ++i) {
            key.set(tab[i]);
            int j = i - 1;
            while (j >= 0 && key.inferieur(tab[j])) {
                tab[j + 1].set(tab[j]);
                j -= 1;
                ++nb_comparaison;
            }
            tab[j + 1].set(key);
        }
        return nb_comparaison;
    }

    private static int Fusion(Paire[] tab, int l, int m, int r) {
        int n1 = m + - l + 1;
        int n2 = r - m;
        int nb_comparaison = 0;

        Paire Gauche[] = new Paire[n1];
        Paire Droite[] = new Paire[n2];

        for (int i = 0; i < n1; ++i)
            Gauche[i] = new Paire(tab[l + i]);
        for (int j = 0; j < n2; ++j)
            Droite[j] = new Paire(tab[m + 1 + j]);

        int i = 0;
        int j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            ++nb_comparaison;
            if (Gauche[i].inferieur(Droite[j])) {
                tab[k].set(Gauche[i]);
                ++i;
            } else {
                tab[k].set(Droite[j]);
                ++j;
            }
            ++k;
        }

        while (i < n1) {
            tab[k].set(Gauche[i]);
            ++i;
            ++k;
        }

        while (j < n2) {
            tab[k++].set(Droite[j++]);
        }
        return nb_comparaison;
    }

    private static int TriFusion_recursif(Paire tab[], int l, int r) {
        int nb_comparaison = 0;
        if (l < r) {
            int m = l + (r - l) / 2;

            nb_comparaison += TriFusion_recursif(tab, l, m);
            nb_comparaison += TriFusion_recursif(tab, m + 1, r);

            nb_comparaison += Fusion(tab, l, m, r);
        }
        return nb_comparaison;
    }

    public static int TriFusion(Paire tab[]) {
        return TriFusion_recursif(tab, 0, tab.length - 1);
    }

    public static void main(String[] args) {
        Paire[] tab = new Paire[4];
        tab[0] = new Paire(3, 3);
        tab[1] = new Paire(2, 2);
        tab[2] = new Paire(1, 1);
        tab[3] = new Paire(0, 0);

        System.out.println("Tableau non-trié : [" + tab[0].print() + ", " + tab[1].print() + ", " + tab[2].print() + ", " + tab[3].print() + "]");
        int nb_comp = Tribulle(tab);
        System.out.println("Execution du tri à bulle, nombre de comparaison : " + nb_comp);
        System.out.println("Tableau trié : [" + tab[0].print() + ", " + tab[1].print() + ", " + tab[2].print() + ", " + tab[3].print() + "]");
    }
}
