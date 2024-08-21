package oppgaver;

public class Kap1_1_6Oppgave4 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(euler(n));
    }

    //Lag metoden public static double euler(int n). Den skal returnere differansen mellom Hn og log(n).
    // I Java gir Math.log(n) oss den naturlige logaritmen til n.
    // Hvor stor må n være for at euler(n) skal returnere et tall som starter med 0,577 som de
    // tre første desimalene?

    //SVAR: n må være større enn 1!
    public static double euler(int n){
        double lgn = Math.log(n);
        double Hn  =  Math.log(n) + 0.577;
        return Hn-lgn;
    }
}
