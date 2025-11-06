package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 5;
        int fix = 2;
        int wartend = 4;
        boolean istVoll;
        int freieFixplätze = max - fix;

        //Wenn noch Fixplätze frei sind (max - fix > 0)
        // und noch Personen auf der Warteliste stehen (wartend > 0)
        if((freieFixplätze > 0) && (wartend > 0)) {
            //Wenn die bestehenden Fixplätze + die Personen auf der Warteliste <= der maximalen Fixplatzanzahl ist,
            //auffüllen bis keine Personen mehr auf der Warteliste stehen:
            if(fix + wartend <= max) {
                fix += wartend;
                wartend = 0;
            }
            //Wenn die bestehenden Fixplätze + die Personen auf der Warteliste > der maximalen Fixplatzanzahl ist,
            //Auffüllen bis keine Fixplätze mehr frei sind:
            if(fix + wartend > max) {
                fix = max;
                wartend -= freieFixplätze;
            }
        }
        //Boolean istVoll = true, wenn Fixplätze >= maximaler Fixplatzanzahl bzw. wenn freieFixplätze == 0, ansonsten Boolean istVoll = false:
        istVoll = fix >= max;

        System.out.println("Maximale Fixplätze:" + max);
        System.out.println("Vergebene Fixplätze:" + fix);
        System.out.println("Personen auf Warteliste:" + wartend);
        System.out.println("Ist es voll? " + istVoll);
    }
}
