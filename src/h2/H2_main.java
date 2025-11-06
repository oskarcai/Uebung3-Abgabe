package h2;

public class H2_main {
    public static void main(String[] args) {
        int jahr = 2028;
        boolean schalt = true;

        //Wenn das Jahr durch 4 teilbar -> Schaltjahr:
        if(jahr%4 == 0) {
            schalt = true;
            //Wenn das Jahr durch 100 teilbar ist UND nicht durch 400 teilbar ist -> Kein Schaltjahr:
            if (jahr%100 == 0 && jahr%400 != 0) {
                schalt = false;
            }
        //Andernfalls, wenn das Jahr nicht durch 4 teilbar ist -> Kein Schaltjahr:
        } else {
            schalt = false;
        }
        System.out.println("Schaltjahr?  " + schalt);
    }
}
