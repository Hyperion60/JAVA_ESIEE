package feuille2.exo.deux;

public class Ex2 {
    int a = 0;

    public static void f(Ex2 o) {
        o.a++;
        o.affiche();
    }

    public void affiche() {
        System.out.println(a);
    }

    public static void main() {
        Ex2 obj = new Ex2();
        obj.affiche(); // 0
        f(obj); // 1
        obj.affiche(); // 1
    }
}
