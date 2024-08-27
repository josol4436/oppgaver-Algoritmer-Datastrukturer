package oppgaver;

import java.util.Arrays;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {
        int[] tabell = Tabell.randPerm(10000);              // en tilfeldig tabell
        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int [] b =  {1, 3, 2, 7, 5, 9, 6, 8, 10, 4,-1, -3, -2, -7, -5, -9, -6, -8, -10, 14};
        int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};  // Figur 1.3.5 a)
        int [] tomTabell = {};

        for (int k : a) System.out.print(k + " ");  // skriver ut a

        //int m = Tabell.maks(a);   // finner posisjonen til største verdi

        //System.out.println("\nStørste verdi ligger på plass " + m);

        //System.out.println(Arrays.toString(Tabell.nestMaks(b)));
        //System.out.println(Arrays.toString(Tabell.nestMin(b)));
        //System.out.println(Tabell.bytt(c, 0, 8));
        //System.out.println(Arrays.toString(Tabell.boblesortering(a)));
        System.out.println();
        //Tabell.boblesortering1(a);
        //System.out.println();
        //Tabell.boblesortering2(a);

        System.out.println(Tabell.lineærsøk(a, 0, 14, 6));              // utskrift: 10

    }
} // class Program
