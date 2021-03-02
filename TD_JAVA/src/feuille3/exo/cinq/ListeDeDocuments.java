package feuille3.exo.cinq;


public class ListeDeDocuments {
    private Document[] liste;
    private int capacity;
    private int len;

    public ListeDeDocuments(int capacity) {
        this.capacity = capacity;
        this.liste = new Document[this.capacity];
        this.len = 0;
    }

    public void addDocument(Document document) {
        if (this.len != this.capacity) {
            this.liste[this.len++] = document;
        }
    }

    public void tousLesAuteurs() {
        System.out.println("Affichage de la liste :");
        for (Document doc: this.liste) {
            System.out.print("- Numéro d'enregistrement : " + doc.getNumero());
            if (doc instanceof Livre) {
                Livre livre = (Livre) doc;
                System.out.print(", Auteur : " + livre.getAuteur());
            }
            System.out.println();
        }
    }

    public void touslesDocuments() {
        System.out.println("Affichage de la liste :");
        for (Document obj: this.liste) {
            System.out.println(obj);
        }
    }
}
