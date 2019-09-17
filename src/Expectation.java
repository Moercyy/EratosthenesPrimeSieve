import java.util.Scanner;

public class Expectation {
    public static void main(String[] args) {
        System.out.println("Geben sie die Zahl ein: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Expectation e = new Expectation();
        String a = e.getPrimeFactors(num);
        if (!a.isEmpty()){
            System.out.println("Die Lösung ist: " + a);
        }else {
            System.out.println("Es konnte kein Zahlenpaar gefunden werden");
        }


    }

   


    public String getPrimeFactors2(int a){
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve();
        int[] asdf = e.generatePrimeNumbers(a);
        String ans = "";
        System.out.println(asdf.length);
        int max = asdf[asdf.length-1];
        for (int i = asdf.length; i >= 0;i--) {
            if(asdf[i] == (a - max)){
                ans = asdf[i]+"";
            }
        }
        return max + " + "+ ans;
    }

}
