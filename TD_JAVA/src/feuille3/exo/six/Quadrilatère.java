package feuille3.exo.six;
import java.lang.Math;

public class Quadrilatère extends Polygone {
    public Point p0;
    public Point p1;
    public Point p2;
    public Point p3;

    public Quadrilatère() {
        this.p0 = new Point();
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Quadrilatère(Point p0, Point p1, Point p2, Point p3) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // Setter
    public void set(int num, Point p) {
        switch (num) {
            case 0 -> this.p0 = p;
            case 1 -> this.p1 = p;
            case 2 -> this.p2 = p;
            case 3 -> this.p3 = p;
        }
    }
    public void set(int num, int x, int y) {
        switch (num) {
            case 0 : {
                this.p0.setX(x);
                this.p0.setY(y);
                break;
            }
            case 1 : {
                this.p1.setX(x);
                this.p1.setY(y);
                break;
            }
            case 2 : {
                this.p2.setX(x);
                this.p2.setY(y);
                break;
            }
            case 3 : {
                this.p3.setX(x);
                this.p3.setY(y);
                break;
            }
        }
    }

    public float perimeter() {
        float peri = (float) Math.sqrt(Math.pow(this.p0.getX() - this.p1.getX(), 2) + Math.pow(this.p0.getY() - this.p1.getY(), 2));
        peri += (float) Math.sqrt(Math.pow(this.p1.getX() - this.p2.getX(), 2) + Math.pow(this.p1.getY() - this.p2.getY(), 2));
        peri += (float) Math.sqrt(Math.pow(this.p2.getX() - this.p3.getX(), 2) + Math.pow(this.p2.getY() - this.p3.getY(), 2));
        peri += (float) Math.sqrt(Math.pow(this.p3.getX() - this.p0.getX(), 2) + Math.pow(this.p3.getY() - this.p0.getY(), 2));
        return peri;
    }

    public String toString() {
        return "Quadrilatère: " + this.p0.toString() + "," + this.p1.toString() + "," + this.p2.toString() + "," + this.p3.toString();
    }
}
