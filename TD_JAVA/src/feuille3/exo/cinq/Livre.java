package feuille3.exo.cinq;

public class Livre extends Document {
    private String auteur;
    private int nb_pages;

    public Livre(String titre, int numero, String auteur, int nb_pages) {
        super(titre, numero);
        this.auteur = auteur;
        this.nb_pages = nb_pages;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public String toString() {
        return super.toString() + ", Auteur : " + this.auteur + ", Nombre de pages : " + this.nb_pages;
    }
}
