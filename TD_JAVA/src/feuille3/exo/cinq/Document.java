package feuille3.exo.cinq;

public class Document {
    private String titre;
    private int numero;

    public Document(String titre, int numero) {
        this.numero = numero;
        this.titre = titre;
    }

    public String getTitre() {
        return this.titre;
    }

    public int getNumero() {
        return this.numero;
    }

    public String toString() {
        return "Titre : " + this.titre + ", Numéro d'enregistrement : " + this.numero;
    }
}
