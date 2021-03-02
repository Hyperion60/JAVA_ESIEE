package feuille3.exo.quatre;

import java.util.ArrayList;

public class Etudiant extends Individu {
    private String formation;
    private int inscription;
    private static ArrayList<Etudiant> list;

    public Etudiant(String nom, String prenom, String adresse, String numero, String formation, int inscription) {
        super(nom, prenom, adresse, numero);
        this.formation = formation;
        this.inscription = inscription;
        if (list == null)
            list = new ArrayList<Etudiant>();
        list.add(this);
    }

    public void affiche() {
        super.affiche();
        System.out.println(formation + " " + inscription);
    }

    public String toString() {
        return super.toString() + " | Formation : " + this.formation + " | Numéro d'inscription : " + this.inscription;
    }

    public static void afficherTous() {
        System.out.println(list);
    }
}
