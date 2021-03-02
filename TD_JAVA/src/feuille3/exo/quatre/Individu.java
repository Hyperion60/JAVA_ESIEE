package feuille3.exo.quatre;

public class Individu {
    private String nom;
    private String prenom;
    private String adresse;
    private String numero;

    public Individu(String nom, String prenom, String adresse, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numero = numero;
    }

    public void affiche() {
        System.out.println(nom + " " + prenom + " " + adresse);
    }

    public String getNom() {
        return this.nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String toString() {
        return super.toString() + " Nom : " + this.nom + " | Prénom : " + this.prenom + " | adresse : " + this.adresse + " | numero : " + this.numero;
    }
}
