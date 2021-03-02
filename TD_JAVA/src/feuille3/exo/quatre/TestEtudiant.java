package feuille3.exo.quatre;


import feuille3.exo.un.E;

public class TestEtudiant {
    public static void main() {
        System.out.println("Création des étudiants...");
        Etudiant x = new Etudiant("Dupont", "Jean", "11 rue du bonheur", "0491222222", "Philosophie", 123);
        Etudiant y = new Etudiant("Java", "Jaime", "13 avenue de la programmation", "11111111", "Informatique", 115);
        Etudiant z = new Etudiant("Tragique", "Romeo", "3 Boulevard Shakespeare", "", "Litterature", 666);
        System.out.println("Création d'un individu...");
        Individu t = new Individu("Stallman", "Richard", "5 rue du libre", "0101010");

        x.affiche();
        Etudiant.afficherTous();
        t.affiche();
        t = x;
        t.affiche();
        y = (Etudiant)t;
        y.affiche();
    }
}
