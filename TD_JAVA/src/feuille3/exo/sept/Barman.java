package feuille3.exo.sept;

public class Barman extends Humain {
    private String nom_bar;

    public Barman(String nom) {
        super(nom, "Vin");
        this.nom_bar = "Chez " + this.quelEstTonNom();
    }

    public Barman(String nom, String bar) {
        super(nom, "Vin");
        this.nom_bar = bar;
    }

    public Barman(String nom, String bar, String boisson) {
        super(nom, boisson);
        this.nom_bar = bar;
    }

    public void parle(String texte) {
        System.out.println("(" + super.quelEstTonNom() + ") - " + texte + "Coco.");
    }

    public void presente() {
        this.parle("Bonjour, je suis le Barman " + this.quelEstTonNom());
        this.parle("Je tien le bar " + this.nom_bar);
    }
}
