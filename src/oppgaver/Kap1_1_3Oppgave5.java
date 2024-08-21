package oppgaver;

import java.util.Arrays;

public class Kap1_1_3Oppgave5 {
    //5.	Lag en metode public static int[] minmaks(int[] a). Den skal ved hjelp av en int-tabell med lengde 2
    // returnere posisjonene til minste og største verdi i tabellen a. Hvis du har funnet at m1 er posisjonen
    // til den minste og m2 til den største, kan du returnere tabellen b definert ved:   int[] b = {m1, m2};
    // Hvor mange sammenligninger bruker metoden din?

    //6.	Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
    //long fak(int n) som regner ut n! . Hvor mange multiplikasjoner utføres i metoden?
    public static void main(String[] args) {
        int[]liste = {26,13};
        System.out.println(Arrays.toString(minmaks(liste)));
    }

    public static int[] minmaks(int[] a){
        int m1 = a[0];
        int m2 = a[1];
        if (m1 < m2){
            int[] b = {m1, m2};
            return b;
        }
        else {
            int[] b = {m2, m1};
            return b;
        }
        //Hvor mange sammenligninger bruker metoden din?
        //Funskjonen bruker kun en sammenlikning som sjekker om m1 er mindre en m2.
    }
}
