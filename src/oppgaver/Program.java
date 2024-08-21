package oppgaver;

import java.util.Arrays;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        int [] b =  {1, 3, 2, 7, 5, 9, 6, 8, 10, 4,-1, -3, -2, -7, -5, -9, -6, -8, -10, 14};

        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        System.out.println(Arrays.toString(Tabell.nestMaks(b)));
        System.out.println(Arrays.toString(Tabell.nestMin(b)));
        //System.out.println(Tabell.bytt(c, 0, 8));
    }
} // class Program
