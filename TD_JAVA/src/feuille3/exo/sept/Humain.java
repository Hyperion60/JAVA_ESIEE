package feuille3.exo.sept;

public class Humain {
    private String nom;
    private String boisson_preferee;

    public Humain(String nom) {
        this.nom = nom;
        this.boisson_preferee = "Eau";
    }

    public Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson_preferee = boisson;
    }


    // Getter
    public String quelEstTonNom() {
        return this.nom;
    }

    public String quelEstTaBoisson() {
        return this.boisson_preferee;
    }

    public void parle(String texte) {
        System.out.println(this.nom + " - " + texte);
    }

    public void presente() {
        this.parle("Bonjour, je m'appelle " + this.nom + " et d'adore le " + this.boisson_preferee);
    }

    public void boire() {
        this.parle("Ah ! un bon verre de " + this.boisson_preferee + " ! GLOUPS !");
    }

    public void confrontation() {
        System.out.println("PAN ! PAN !");
    }


    protected String Nom() {
        return this.nom;
    }
}
