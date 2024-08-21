package oppgaver;

import java.util.Arrays;
import java.util.Random;

public class Tabell {
    private Tabell() {
    }   // privat standardkonstruktør - hindrer instansiering

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k + 1);        // en tilfeldig tall fra 0 til k
            bytt(a, k, i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    public static int maks(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a, 0, a.length);     // kaller metoden over
    }

    public static int min(int[] a, int fra, int til) {
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }
        int m = fra;
        int minverdi = a[fra];
        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;
                minverdi = a[i];
            }
        }
        return minverdi;//Returnerer minste tall mellom fra og til.
        // return m;    Returnerer posisjonen til det minste tallet.

    }
    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }

    public static char[] bytt(char[] c, int i, int j){
        if (i < 0 || j > c.length || i >= j) {
            throw new IllegalArgumentException("Illegalt intervall!");
        }
        else {
            char bokstav1 = c[j];
            char bokstav2 = c[i];
            c[i] = bokstav1;
            c[j] = bokstav2;
        }
        return c;
    }

    public static int[] nestMaks(int[] a) // ny versjon
    {
        int n = a.length;     // tabellens lengde
        if (n < 2) throw      // må ha minst to verdier
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 0;      // m er posisjonen til største verdi
        int nm = 1;     // nm er posisjonen til nest største verdi

        // bytter om m og nm hvis a[1] er større enn a[0]
        if (a[1] > a[0]) { m = 1; nm = 0; }

        int maksverdi = a[m];                // største verdi
        int nestmaksverdi = a[nm];           // nest største verdi

        for (int i = 2; i < n; i++)
        {
            if (a[i] > nestmaksverdi)
            {
                if (a[i] > maksverdi)
                {
                    nm = m;
                    nestmaksverdi = maksverdi;     // ny nest størst

                    m = i;
                    maksverdi = a[m];              // ny størst
                }
                else
                {
                    nm = i;
                    nestmaksverdi = a[nm];         // ny nest størst
                }
            }
        } // for

        return new int[] {m,nm};    // m i posisjon 0, nm i posisjon 1

    } // nestMaks

    public static int[] nestMin(int[] a) // ny versjon
    {
        int n = a.length;     // tabellens lengde
        if (n < 2) throw      // må ha minst to verdier
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 1;      // m er posisjonen til minste verdi
        int nm = 0;     // nm er posisjonen til nest minste verdi

        // bytter om m og nm hvis a[1] er mindre enn a[0]
        if (a[1] < a[0]) { m = 0; nm = 1; }

        int minverdi = a[m];                // minste verdi
        int nestminverdi = a[nm];           // nest minste verdi

        for (int i = 2; i < n; i++)
        {
            if (a[i] < nestminverdi)
            {
                if (a[i] < minverdi)
                {
                    nm = m;
                    nestminverdi = minverdi;     // ny nest minst

                    m = i;
                    minverdi = a[m];              // ny minst
                }
                else
                {
                    nm = i;
                    nestminverdi = a[nm];         // ny nest minst
                }
            }
        } // for

        return new int[] {nm,m};    // nm i posisjon 0, m i posisjon 1

    } // nestMaks
}
