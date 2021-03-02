package feuille3.exo.six;


public class EnsemblePolygone {
    private int capacite;
    private int len;
    private Polygone[] liste;

    public EnsemblePolygone(int capacite) {
        this.capacite = capacite;
        this.liste = new Polygone[this.capacite];
        this.len = 0;
    }

    public void ajouterPolygone(Polygone pol) {
        if (this.len == this.capacite) {
            this.liste[this.len++] = pol;
        }
    }

    public int sommePerimetres() {
        int sum = 0;
        for (Polygone obj : this.liste) {
            if (obj instanceof Quadrilatère) {
                Quadrilatère quadri = (Quadrilatère) obj;
                sum += quadri.perimeter();
            } else if (obj instanceof Triangle) {
                Triangle triangle = (Triangle) obj;
                sum += triangle.perimeter();
            }
        }
        return sum;
    }

    public void print_all() {
        for (Polygone obj: this.liste) {
            System.out.println(obj.toString());
        }
    }
}
