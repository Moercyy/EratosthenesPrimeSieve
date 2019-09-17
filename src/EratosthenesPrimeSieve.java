import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static java.lang.StrictMath.sqrt;

import static java.util.stream.LongStream.rangeClosed;
import static java.util.stream.IntStream.range;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int value;
    int[] array;

    public EratosthenesPrimeSieve() {
    }

    public EratosthenesPrimeSieve(int value) {
        array = generatePrimeNumbers(value);
        //printPrimes();
    }

    @Override
    public boolean isPrime(int p) {
        return p > 1 && rangeClosed(2, (int) sqrt(p)).noneMatch(divisor -> p % divisor == 0);
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }

    public int[] generatePrimeNumbers(int n) {
        return range(1, n).parallel().filter(this::isPrime).toArray();
    }





}
