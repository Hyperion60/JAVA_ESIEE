package feuille2.exo.quatre;

public class Point {
    int abscisse;
    int ordonnee;
    private static int nombre;
    int numero;

    public Point() {
        this.abscisse = 0;
        this.ordonnee = 0;
        this.numero = nombre++;
    }

    public Point(int u, int v) {
        this.abscisse = u;
        this.ordonnee = v;
        this.numero = nombre++;
    }

    public void set(Point q) {
        this.abscisse = q.abscisse;
        this.ordonnee = q.ordonnee;
    }

    public void set(int u, int v) {
        this.abscisse = u;
        this.ordonnee = v;
    }

    public void translate(int u, int v) {
        this.abscisse += u;
        this.ordonnee += v;
    }

    public void affiche() {
        System.out.println("Absisse : " + this.abscisse + ", Ordonnee : " + this.ordonnee);
        System.out.println("Nombre de point : " + nombre + ", Numero du point : " + this.numero);
    }

    public boolean origine() {
        return (this.abscisse == this.ordonnee && this.abscisse == 0);
    }

    public boolean egale(Point q) {
        return (this.abscisse == q.abscisse && this.ordonnee == q.ordonnee);
    }

    public Point symetrie() {
        return new Point(this.abscisse * -1, this.ordonnee * -1);
    }
}
