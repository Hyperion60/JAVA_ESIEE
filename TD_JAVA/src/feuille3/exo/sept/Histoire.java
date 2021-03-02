package feuille3.exo.sept;

import java.io.IOException;
import java.lang.Runtime;

public class Histoire {
    public static void main(String[] args) throws IOException {
        Dame ikora = new Dame("Ikora Rey", "Thé", "violette");
        Dame eris = new Dame("Eris Morne", "verte");
        Dame amanda = new Dame("Amanda Holliday", "Eau", "marron clair");
        Cowboys cayde = new Cowboys("Cayde-6", "Cidre", "légendaire");
        Brigands dredgen = new Brigands("Le Vagabond", "Scotch");
        dredgen.kidnappe(amanda);
        System.out.println("\nEtat avant l'histoire");


        System.out.println("Au commencement, nous avions deux demoiselles.");
        ikora.presente();
        eris.presente();
        System.out.println("Protégées par un cowboy.");
        cayde.presente();
        System.out.println("Et un vicieu brigand");
        dredgen.presente();
        System.out.println("Ikora laissa Eris seule le temps d'aller se changer.");
        ikora.change_robe("jaune");
        System.out.println("En attendant, Eris allat se désaltérer...");
        eris.boire();
        System.out.println("Quand soudain... Le brigand l'a surpris !");
        dredgen.kidnappe(eris);
        System.out.println("Aussitôt alerté, le cowboy se lanca à la poursuite du malfrat.");
        cayde.tire(dredgen);
        dredgen.est_capture(cayde);
        System.out.println("Le malfrat croupis en prison et tout est bien qui finit bien.");
    }
}
