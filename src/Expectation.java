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

    public String getPrimeFactors(int a) {
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve();
        int[] pArray = e.generatePrimeNumbers(a);
        System.out.println(pArray.length);
        String answer = "";
        for (int i = 0; i < pArray.length; i++) {
            for (int j = 0; j < pArray.length; j++) {
                //System.out.println(sum);
                if ((pArray[i] + pArray[j] == a)) {
                    answer = (pArray[i] + " + " + pArray[j]);
                }
            }

        }
        return answer;
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
