package p1;

public class P1_main {
    public static void main(String[] args) {
        int würfel = 1;

        if((würfel == 1) || (würfel == 4)) {
            System.out.println("Gewonnen!");
        } else if(würfel == 2) {
            System.out.println("Verloren!");
        } else if(würfel == 5) {
            System.out.println("Unentschieden!");
        } else if((würfel != 1) && (würfel != 2) && (würfel != 5)) {
            System.out.println("not defined!");
        }
    }
}
