package feuille3.exo.cinq;


public class Bibliothèque {
    public static void main() {
        System.out.println("Création de la base de test...");
        ListeDeDocuments liste = new ListeDeDocuments(5);
        Livre destiny = new Livre("Destiny", 1, "Bungie", 130);
        liste.addDocument(destiny);
        Livre nvelle = new Livre("Nouvelle encyclopédie du savoir relatif et absolu", 2, "Bernard Werber", 655);
        liste.addDocument(nvelle);
        Livre code = new Livre("Da Vinci Code", 3, "Dan Brown", 574);
        liste.addDocument(code);
        Dictionnaire linux = new Dictionnaire("Linux Administration", 4, "Francais", 5);
        liste.addDocument(linux);
        Dictionnaire dict = new Dictionnaire("Le Robert", 5, "Francais", 1);
        liste.addDocument(dict);
        Dictionnaire trad = new Dictionnaire("Dictionnaire Garnier", 6, "Francais-Anglais", 1);
        liste.addDocument(trad);

        liste.tousLesAuteurs();
        System.out.println();
        System.out.println(destiny);
        System.out.println(dict);

        liste.touslesDocuments();
    }
}
