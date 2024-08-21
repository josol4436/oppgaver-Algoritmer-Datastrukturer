package oppgaver;

public class Kap1_2_1Oppgave1 {
    public static void main(String[] args){
        int []liste = {-3,41,5,-5,2,49,60,21,3,4,51,37};
        System.out.println(min(liste, 1, 6));
        System.out.println(min(liste));
    }

    public static int min(int[]a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til) {
                  throw new IllegalArgumentException("Illegalt intervall!");
               }
        int m = fra;
        int minverdi = a[fra];
        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi){
                m = i;
                minverdi = a[i];
            }
        }
        //return minverdi; Returnerer minste tall mellom fra og til.
        return m;    //Returnerer posisjonen til det minste tallet.

        //Det må stilles bestemte krav til fra og til for at intervallet a[fra:til> skal ha mening:
        //
        //Posisjonen/indeksen fra kan ikke være negativ siden 0 er første lovlige indeks.
        //Posisjonen til kan ikke være større enn a.length, dvs. tabellens lengde. Tabellen i
        //Figur 1.2.1 a) har lengde 17. Lovlig verdi for til vil der være 17 eller mindre.
        //Posisjonen fra kan ikke være større enn til, dvs vi kan ikke ha fra til høyre for til.
        //Vi kaller a[fra:til> et lovlig (halvåpent) tabellintervall hvis 1, 2 og 3 er oppfylt. Vi sier at det
        // er tomt (men lovlig) hvis fra = til. På samme måte som i mengdelære der den tomme mengden har
        // mening, kan det gi mening å ha et tomt intervall.
    }
    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }
}
