package feuille2.exo.cinq;

import java.util.Scanner;

public class Paire {
    private int x1;
    private int y1;

    // Exercice 5 et 6
    public Paire() {
        this.x1 = 0;
        this.y1 = 0;
    }

    public Paire(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public Paire(Paire q) {
        this.x1 = q.x1;
        this.y1 = q.y1;
    }

    public void affiche() {
        System.out.print("(" + this.x1 + ", " + this.y1 + ")");
    }

    public String print() {
        return "(" + this.x1 + ", " + this.y1 + ")";
    }

    // Getter
    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    // Setter
    public void set(Paire q) {
        this.x1 = q.x1;
        this.y1 = q.y1;
    }

    public void setX1(int u) {
        this.x1 = u;
    }

    public void setY1(int v) {
        this.y1 = v;
    }

    /* Exercice 6 */
    public boolean inferieur(Paire q) {
        return this.x1 < q.x1 || (this.x1 == q.x1 && this.y1 < q.y1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez X :");
        int x = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Entrez Y :");
        int y = scan.nextInt();
        Paire p1 = new Paire(x, y);
        p1.affiche();
    }
}
