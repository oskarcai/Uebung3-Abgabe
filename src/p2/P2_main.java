package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 100;
        int d = 0;

        boolean E1 = a == b;
        boolean E2 = a == b || a == c;
        boolean E3 = (a + b) >= c;
        boolean E4 = (a + b + c) >= 100;

        boolean[] werte = {E1, E2, E3, E4};

        for (int i = 0; i < werte.length; i++) {
            if (werte[i]) {
                d += 1;
            }
        }

        if (d == 1) {
            System.out.println("Es ist " + d + " Eigenschaft erfüllt");

        } else {
            System.out.println("Es sind " + d + " Eigenschaften erfüllt");
        }
    }
}