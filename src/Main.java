import java.util.ArrayList;
import java.util.List;

public class Main {
    // Our limit
    private final static int limit = 4000000;
    private static List<Integer> fibSeq;

    public Main() {

    }

    // Method for iterative calculation of the Fibonacci seq.
    public static void fib() {
        // Init the array
        fibSeq = new ArrayList();
        // Define var to store our terms (start from 1)
        int first = 1, second = 2;
        fibSeq.add(first);
        fibSeq.add(second);
        for (int i = 1; ; i++) {
            int savePrev1 = first;
            first = second;
            second = savePrev1 + second;
            // Condition from email
            if (second >= limit) {
                break;
            } else {
                fibSeq.add(second);
            }
            // For testing
            //System.out.println(fibSeq);
        }
    }

    // Method to count sum of the even-valued terms
    public static int sumOfEven(List<Integer> sequences) {
        int sum = 0;
        for (int i : sequences) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        fib();
        int sumOf = sumOfEven(fibSeq);
        System.out.println("Sum of the even numbers in sequence= " + sumOf);

    }
}
