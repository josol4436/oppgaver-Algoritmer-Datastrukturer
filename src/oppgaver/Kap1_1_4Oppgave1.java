package oppgaver;

public class Kap1_1_4Oppgave1 {
    public static void main(String[] args) {
//Hvor mange grunnleggende operasjoner utfører Programkode 1.1.4 hvis tabellen a inneholder
// i) 10, 5, 7, 2, 9, 1, 3, 8, 4, 6.
// ii) 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.
// iii) 1, 3, 2, 7, 5, 9, 6, 8, 10, 4.

    }
    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdateres
        }
        return m;   // returnerer indeks/posisjonen til største verdi
//Antall operasjoner: 1 + 1 + n + n - 1 + 2(n-1) + 2x + 1 = 4n + 2x
    }
    //En opperasjon kalles grunnleggende hvis den ikke kan deles opp i enklere operasjoner. Det er ingen bestemt regel for dette,
    // men en kunne for eksempel (på et mer overordnet nivå) kalle flg. operasjoner for grunnleggende:
    //
    //en tilordning - en variabel får en verdi
    //en tabelloperasjon - en tabellverdi aksesseres
    //en sammenligning - to verdier sammenlignes
    //en regneoperasjon - f.eks. en addisjon av to tall
    //En operasjon er sammensatt hvis den består av flere grunnlegggende operasjoner.
    // F.eks. er  if (a[i] > a[m]) sammensatt av to tabelloperasjoner og én sammenligning.
    //
    //Vi kan finne en formel for en algoritmes effektivitet ved å telle opp antallet ganger det utføres
    // en grunnleggende operasjon.
}
