package feuille3.exo.sept;

public class Histoire {
    public static void main() {
        Dame ikora = new Dame("Ikora Rey", "Thé", "violette");
        Dame eris = new Dame("Eris Morne", "verte");
        Dame amanda = new Dame("Amanda Holliday", "Eau", "marron clair");
        Cowboys cayde = new Cowboys("Cayde-6", "Cidre", "légendaire");
        Brigands dredgen = new Brigands("Le Vagabond", "Scotch");

        System.out.println("Prélude :");
        Sherif shaxx = new Sherif("Shaxx");
        dredgen.kidnappe(amanda);


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
        System.out.println("Quand soudain... Le brigand l'a surprise !");
        dredgen.kidnappe(eris);
        System.out.println("Aussitôt alerté, le cowboy se lanca à la poursuite du malfrat.");
        cayde.tire(dredgen);
        dredgen.est_capture(cayde);
        eris.remercie(cayde);
        cayde.boire();
        System.out.println("Pendant que le cowboy avait le dos tourné, le malfrat s'échappa !");
        dredgen.echappe();
        System.out.println("Un shérif arriva en ville pour retrouver et capturer ce dernier");
        shaxx.presente();
        shaxx.recherche(dredgen, 250);
        dredgen.presente();
        System.out.println("Après plusieurs jours de recherches et alerté par des habitants, une nouvelle confrontation se produisit");
        shaxx.confrontation();
        shaxx.arrestation(dredgen);
        shaxx.presente();
        System.out.println("Cependant les os d'ahamkara que le Shérif Shaxx gardait en trophé le corrompu et il devint un renégat");
        Ripoux shaxx1 = new Ripoux(shaxx);
        System.out.println("Cayde s'appercevant que le shérif avait déserté, il fut promis à son poste pour le rattraper");
        Sherif cayde6 = new Sherif(cayde);
        cayde6.recherche(shaxx1, 400);
        shaxx1.presente();
    }
}
