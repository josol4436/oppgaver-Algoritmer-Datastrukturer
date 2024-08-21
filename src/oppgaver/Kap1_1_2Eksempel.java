package oppgaver;

public class Kap1_1_2Eksempel {
    public static void main(String[] args){
        int []liste = {-3,41,5,-3,2,49,60,21,3,4,51,37};
        System.out.println(maks(liste)); //Printer posisjonen til den største verdien
    }
    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi (m for maks)

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi
    } // maks
}

