package feuille3.exo.sept;

public class Brigands extends Humain {
    private String look;
    private int nb_dame;
    private boolean en_prison;
    private int recompense;

    public Brigands(String nom) {
        super(nom, "Tord-Boyaux");
        this.look = "mechant";
        this.nb_dame = 0;
        this.en_prison = false;
        this.recompense = 100;
    }
    public Brigands(String nom, String boisson) {
        super(nom, boisson);
        this.look = "mechant";
        this.nb_dame = 0;
        this.en_prison = false;
        this.recompense = 100;
    }

    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look;
    }

    public void presente() {
        this.parle("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime le " + super.quelEstTaBoisson());
        this.parle("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.nb_dame + " dames !");
        this.parle("Ma tête est mise à prix à " + this.recompense + "$");
    }

    public void kidnappe(Dame dame) {
        this.nb_dame++;
        dame.hurle();
        this.parle("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais !");
    }

    public void est_capture(Cowboys sherif) {
        this.en_prison = true;
        sherif.setPopularite(sherif.getPopularite() + this.nb_dame);
        this.nb_dame = 0;
        this.parle("Damned, je suis fait ! " + sherif.quelEstTonNom() + ", tu m'as eu !");
    }

    public void echappe() {
        this.en_prison = false;
    }

    // Setter

    public void setRecompense(int recompense) {
        this.recompense = recompense;
    }
}

