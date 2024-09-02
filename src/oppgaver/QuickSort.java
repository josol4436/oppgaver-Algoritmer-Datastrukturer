package oppgaver;

import java.util.Arrays;

import static oppgaver.Tabell.bytt;

public class QuickSort {
    public static void main(String[] args) {
        int [] b =  {1, 3, 2, 7, 5, 9, 6, 8, 10, 4,-1, -3, -2, -7, -5, -9, -6, -8, -10, 14};
        quickSort(b);
        System.out.println(Arrays.toString(b));
    }
    public static void quickSort(int [] tabell){
        quickSort(tabell, 0, tabell.length-1);
    }
    public static void quickSort(int [] tabell, int fra, int til){
        if(fra >= til) return;

        bytt(tabell, til, fra + (til - fra)/2); //Hvorfor ikke (fra+til)/2? Fordi du kan få overflow hvis f.eks. fra og til er over halvparten av maks int.
        int pivot = tabell[til];
        int v = fra, h = til-1;
        while (true){
            while(tabell[v] < pivot && v <= h) v++;
            while (tabell[h] >= pivot && v <= h) h--;
            if (v>=h) break; //Hvis pivot elementet har kun mindre eller lik på venstre og kun større til høyre.
            bytt(tabell, v++, h--);
        }
        bytt(tabell, til, v);
        quickSort(tabell, fra, v-1);
        quickSort(tabell, v+1, til);
    }
    //Implimenter mergesort :))
}
