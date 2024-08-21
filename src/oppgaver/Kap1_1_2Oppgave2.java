package oppgaver;

public class Kap1_1_2Oppgave2 {
    public static void main(String[] args){
        int []liste = {-3,41,5,-5,2,49,60,21,3,4,51,37};
        System.out.println(min(liste));
    }

    public static int min(int[]a){
        int min = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) min = i;
        }
        return min;//Returnerer posisjonen til det minste tallet.
    }
}
