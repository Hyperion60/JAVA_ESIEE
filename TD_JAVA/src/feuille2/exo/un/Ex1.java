package feuille2.exo.un;

public class Ex1 {
    int a = 0;

    public void f() {
        a++;
    }

    public void affiche() {
        System.out.println(a);
    }

    public static void main() {
        Ex1 p = new Ex1();
        Ex1 q = new Ex1();
        p.affiche(); // 0
        q.affiche(); // 0
        p.f();
        p.affiche(); // 1
        q.affiche(); // 0
        p = q;
        p.f();
        p.affiche(); // 1
        q.affiche(); // 1
    }
}