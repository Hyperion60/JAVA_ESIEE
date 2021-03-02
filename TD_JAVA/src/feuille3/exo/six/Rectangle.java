package feuille3.exo.six;

import java.lang.Math;

public class Rectangle extends Quadrilatère {
    public void construire(Point a, Point b) {
        this.p1 = new Point(b.getX(), a.getY());
        this.p3 = new Point(a.getX(), b.getY());
    }

    public Rectangle() {}

    public Rectangle(Point a, Point b) {
        this.p0 = a;
        this.p2 = b;
        construire(a, b);
    }

    public int largeur() {
        return Math.abs(this.p0.getY() - this.p2.getY());
    }

    public int longueur() {
        return Math.abs(this.p1.getX() - this.p0.getX());
    }

    public int surface() {
        return Math.abs(this.largeur() * this.longueur());
    }

    public String toString() {
        return "Rectangle: " + this.p0.toString() + "," + this.p1.toString() + "," + this.p2.toString() + "," + this.p3.toString();
    }
}
