package oppgaver;

public class Kap1_1_3Oppgave6 {
    //Utrykket n! betyr n fakultet og er gitt ved n! = n · (n-1) ·  ·  · 2 · 1 . Lag en metode
    //long fak(int n) som regner ut n!.
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n + "! = " + fak(n));
        System.out.println();
    }
    public static long fak(int n){
        int sum = 1;
        int antall = 0;
        for (int i = 1; i <= n; i++) { //må ha i <= n for å få med siste loop hvor i = n.
            sum = sum*i; //ganger forige summen med neste tall i loopen
        }
        return sum;
    }
    //Hvor mange multiplikasjoner utføres i metoden?
    //Antall multiplikasjoner vil være n-1 ganger, eks. 4! = 1*2*3*4
}
