package p3;

public class P3_main {
    public static void main(String[] args) {
        int a = 15;

        int betrag;
        if(a < 0) {
            betrag = a*-1;
        } else betrag = a;

        int quadrat = a * a;

        boolean gerade = a % 2 == 0;
        String gerade_oder_ungerade = new String();
        if(gerade) {
            gerade_oder_ungerade = "gerade";
        } else {
            gerade_oder_ungerade = "ungerade";
        }

        System.out.println("Betrag der Zahl " + a + " : " + betrag + " Quadrat der Zahl " + a + " : " + quadrat + " Die Zahl " + a + " ist: " + gerade_oder_ungerade);
    }
}
