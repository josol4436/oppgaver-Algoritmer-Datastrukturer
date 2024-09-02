package oppgaver;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] b =  {1, 3, 2, 7, 5,-1, -3,  14};
        System.out.println("Original tabell:");
        printArray(b);

        mergeSort(b, 0, b.length - 1);

        System.out.println("\nSortert tabell:");
        printArray(b);
    }

    public static void mergeSort(int [] tabell, int venstre, int høyre){
        if (venstre < høyre) {
            // Finn midten
            int midt = venstre + (høyre - venstre) / 2;

            // Sorter første og andre halvdel
            mergeSort(tabell, venstre, midt);
            mergeSort(tabell, midt + 1, høyre); //Disse deler opp hele tabellen i små deler så lenge venstre verdien er større enn høyre verdien

            // Slå sammen de sorterte halvdelene
            merge(tabell, venstre, midt, høyre);
        }
    }
    public static void merge(int [] tabell, int venstre, int midt, int høyre){
        int n1 = midt - venstre + 1; //n1 og n2 blir lengden av de nye arrayene
        int n2 = høyre - midt;

        // Opprett midlertidige arrays
        int[] venstreTabell = new int[n1];
        int[] høyreTabell = new int[n2];

        // Kopier data til de midlertidige arrays
        for (int i = 0; i < n1; ++i) {
            venstreTabell[i] = tabell[venstre + i];
        }
        for (int j = 0; j < n2; ++j) {
            høyreTabell[j] = tabell[midt + 1 + j];
        }
        System.out.println(Arrays.toString(venstreTabell));
        System.out.println(Arrays.toString(høyreTabell));
        // Slå sammen de midlertidige arrays

        // Initialindeksene til de to del-arrays
        int i = 0, j = 0;

        // Initialindeks til sammenslått array
        int k = venstre;
        while (i < n1 && j < n2) {
            if (venstreTabell[i] <= høyreTabell[j]) {
                tabell[k] = venstreTabell[i];
                i++;
            } else {
                tabell[k] = høyreTabell[j];
                j++;
            }
            k++;
        }

        // Kopier de resterende elementene av leftArray, hvis det er noen
        while (i < n1) {
            tabell[k] = venstreTabell[i];
            i++;
            k++;
        }

        // Kopier de resterende elementene av rightArray, hvis det er noen
        while (j < n2) {
            tabell[k] = høyreTabell[j];
            j++;
            k++;
        }
    }
    // Funksjon for å skrive ut array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
