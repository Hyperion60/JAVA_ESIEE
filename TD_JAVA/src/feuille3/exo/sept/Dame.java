package feuille3.exo.sept;

public class Dame extends Humain {
    private String couleur;
    private boolean is_free;

    public Dame(String nom, String couleur) {
        super(nom, "lait");
        this.couleur = couleur;
        this.is_free = true;
    }

    public Dame(String nom, String boisson, String couleur) {
        super(nom, boisson);
        this.couleur = couleur;
        this.is_free = true;
    }

    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    public void hurle() {
        this.parle("IIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    public void remercie(Cowboys heros) {
        this.parle("Merci " + heros.quelEstTonNom() + " de m'avoir secourue !\n");
    }

    public void change_robe(String couleur) {
        this.couleur = couleur;
        this.parle("Regardez ma nouvelle robe " + this.couleur);
    }

    public void presente() {
        this.parle("Bonjour, je suis " + this.quelEstTonNom());
        this.parle("Ma belle robe est " + this.couleur);
    }
}
