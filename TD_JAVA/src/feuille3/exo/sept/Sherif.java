package feuille3.exo.sept;

public class Sherif extends Cowboys {
    private int nb_brigands;


    public Sherif(String nom) {
        super(nom);
        this.nb_brigands = 0;
    }

    public Sherif(Cowboys cowboy) {
        super(cowboy.quelEstTonNom(), cowboy.quelEstTaBoisson());
        this.nb_brigands = 0;
    }

    public Sherif(String nom, String boisson) {
        super(nom, boisson);
        this.nb_brigands = 0;
    }

    public Sherif(String nom, String boisson, String adjectif) {
        super(nom, boisson, adjectif);
        this.nb_brigands = 0;
    }

    public void presente() {
        parle("Je suis " + this.quelEstTonNom());
        parle("J'ai arrêté " + this.nb_brigands + " brigands !");
    }

    public void arrestation(Brigands brigand) {
        parle("Au nom de la loi, je vous arrête !");
        this.nb_brigands++;
        brigand.est_capture(this);
    }

    public void recherche(Brigands brigand, int prix) {
        parle("OYEZ OYEZ BRAVES GENS ! ! " + prix + " $ a qui arrêtera " + brigand.quelEstTonNom() + " mort ou vif ! !");
        brigand.setRecompense(prix);
    }

    public String quelEstTonNom() {
        return "Shérif " + super.quelEstTonNom();
    }
}
