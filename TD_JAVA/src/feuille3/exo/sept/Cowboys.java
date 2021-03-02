package feuille3.exo.sept;

public class Cowboys extends Humain {
    private int popularite;
    private String adjectif;

    public Cowboys(String name) {
        super(name, "whisky");
        this.popularite = 0;
        this.adjectif = "vaillant";
    }

    public Cowboys(String name, String boisson) {
        super(name, boisson);
        this.popularite = 0;
        this.adjectif = "vaillant";
    }

    public Cowboys(String name, String boisson, String adjectif) {
        super(name, boisson);
        this.popularite = 0;
        this.adjectif = adjectif;
    }

    // Getter
    public int getPopularite() {
        return this.popularite;
    }

    public String getAdjectif() {
        return this.adjectif;
    }

    // Setter
    public void setPopularite(int popularite) {
        this.popularite = popularite;
    }

    public void setAdjectif(String adjectif) {
        this.adjectif = adjectif;
    }

    public String quelEstTonNom() {
        return this.adjectif + " " + super.quelEstTonNom();
    }

    public void tire(Brigands brigand) {
        System.out.println("Le " + this.quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
        this.parle("Prend ça crapule !");
    }

    public void presente() {
        this.parle("Bonjour, je suis le " + this.quelEstTonNom() + " !");
        this.parle("J'ai déjà secourue " + this.popularite + " dames !");
    }
}
