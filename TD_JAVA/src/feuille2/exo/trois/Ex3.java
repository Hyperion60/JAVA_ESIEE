package feuille2.exo.trois;

public class Ex3 {
    int a = 0;

    public void f(int a) {
        System.out.println(a);
        System.out.println(this.a); // Pour afficher l'attribut 'a'
    }

    public static void main() {
        Ex3 p = new Ex3();
        p.f(12); /* 12
                       0 */
    }
}
