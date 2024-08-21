package oppgaver;


import java.util.Arrays;

public class Kap1_2_1Oppgave4 {
    public static void main(String[] args) {
        //Arrays

        //Finn hvilke metoder i class Arrays som arbeider med tabellintervaller (from/to eller fromIndex/toIndex).

        //SVAR: Det er mange funksjoner som bruker to/from eller fromIndex/toIndex, hvor
        // mange funksjoner kjører en rangeCheck. Dette er en funksjon som hiver en feilmelding
        // om verdiene fra og til ikke stemmer.

        //
        //    static void rangeCheck(int arrayLength, int fromIndex, int toIndex) {
        //        if (fromIndex > toIndex) {
        //            throw new IllegalArgumentException(
        //                "fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        //        }
        //        if (fromIndex < 0) {
        //            throw new ArrayIndexOutOfBoundsException(fromIndex);
        //        }
        //        if (toIndex > arrayLength) {
        //            throw new ArrayIndexOutOfBoundsException(toIndex);
        //        }
        //    }
    }
}
