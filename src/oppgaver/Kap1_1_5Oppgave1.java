package oppgaver;

public class Kap1_1_5Oppgave1 {
    public static void main(String[] args) {
        int[]liste = {2};
        System.out.println(maks(liste));
    }
    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks
    //Sjekk at Programkode 1.1.5 gir korrekte resultater.
    // Hva skjer hvis a har lengde 1 og hva hvis a er tom (lengde 0).
    //Lengde = 1, returnerer 0;
    //Lengde = 0, feilmelding
}
