package feuille3.exo.deux;

public class Individu {
    private String nom;
    private String adresse;

    public Individu(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public void affiche() {
        System.out.println(nom + " " + adresse);
    }

    public String getNom() {
        return this.nom;
    }

    public String getAdresse() {
        return adresse;
    }
}
