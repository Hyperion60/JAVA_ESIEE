package feuille3.exo.six;

public class Test {
    public static void main(String[] args) {
        System.out.println("Création des objets de test...");
        Polygone poly1 = new Polygone();
        Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1));
        Quadrilatère quadrilatere = new Quadrilatère(new Point(0, 1), new Point(1, 1), new Point(0, 1), new Point(-1, -1));
        Rectangle rectangle = new Rectangle(new Point(0, 2), new Point(3, 0));
        Rectangle rectangle2 = new Rectangle();

        System.out.println("\nTest de la classe Triangle :");
        System.out.println(triangle);
        System.out.println("Périmètre : " + triangle.perimeter());
        triangle.set(0, 0, 3);
        triangle.set(1, new Point(1, 3));
        System.out.println(triangle);
        System.out.println("Périmètre : " + triangle.perimeter());

        System.out.println("\nTest de la classe Quadrilatère :");
        System.out.println(quadrilatere);
        System.out.println("Périmètre : " + quadrilatere.perimeter());
        quadrilatere.set(0, -1, 3);
        System.out.println(quadrilatere);
        System.out.println("Périmètre : " + quadrilatere.perimeter());

        System.out.println("\nTest de la classe Rectangle :");
        System.out.println(rectangle);
        System.out.println(rectangle2);
        System.out.println("Périmètre : " + rectangle.perimeter());
        System.out.println("Largeur : " + rectangle.largeur());
        System.out.println("Longueur : " + rectangle.longueur());
        System.out.println("Surface : " + rectangle.surface());

        System.out.println("\nTest de la classe EnsemblePolygone");
        EnsemblePolygone liste = new EnsemblePolygone(3);
        liste.ajouterPolygone(poly1);
        liste.ajouterPolygone(triangle);
        liste.ajouterPolygone(quadrilatere);
        liste.ajouterPolygone(rectangle);
        liste.print_all();
        System.out.println("Somme des périmètres : " + liste.sommePerimetres());
    }
}
