package feuille3.exo.deux;

public class Etudiant extends Individu {
    private String formation;

    public Etudiant(String nom, String adresse, String formation) {
        super(nom, adresse); // Ajout du constructeur de la super classe
        this.formation = formation;
    }

    public void affiche() {
        System.out.println(super.getNom() + " " + super.getAdresse() + " " + this.formation);
    }
}
