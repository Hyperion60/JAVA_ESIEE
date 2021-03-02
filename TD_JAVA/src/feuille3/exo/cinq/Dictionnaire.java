package feuille3.exo.cinq;

public class Dictionnaire extends Document {
    private String langue;
    private int nb_tomes;

    public Dictionnaire(String titre, int numero, String langue, int nb_tomes) {
        super(titre, numero);
        this.langue = langue;
        this.nb_tomes = nb_tomes;
    }

    public String toString() {
        return super.toString() + ", Langue : " + this.langue + ", Nombre de tomes : " + this.nb_tomes;
    }
}
