package feuille3.exo.sept;

public class Ripoux extends Brigands {
    public Ripoux(Sherif renegade) {
        super(renegade.Nom(), renegade.quelEstTaBoisson());
    }

    public void libere(Brigands brigand) {
        parle(brigand.quelEstTonNom() + " te voilà libre !");
        brigand.echappe();
    }


}
