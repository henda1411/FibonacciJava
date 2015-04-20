import java.util.ArrayList;
import java.util.List;

public class Main {
    // Our limit
    private final static int LIMIT = 4000000;

    // Method for iterative calculation of the Fibonacci seq.
    public List<Integer> fib(int limit) {
        List<Integer> fibSeq = new ArrayList();
        // Define var to store our terms (start from 1)
        int first = 1;
        int second = 2;
        fibSeq.add(first);
        fibSeq.add(second);
        for (int i = 1; ; i++) {
            int savePrevTerm = first;
            first = second;
            second = savePrevTerm + second;
            // Condition from email
            if (second >= limit) {
                break;
            } else {
                fibSeq.add(second);
            }
            // For testing
//            System.out.println(fibSeq.size());
        }
        return fibSeq;
    }

    // Method to count sum of the even-valued terms
    public int sumOfEven(List<Integer> sequences) {
        int sum = 0;
        for (int i : sequences) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Main fibonaci = new Main();
        List sequence = fibonaci.fib(LIMIT);
        int sumOf = fibonaci.sumOfEven(sequence);
        System.out.println("Sum of the even numbers in sequence= " + sumOf);
    }
}
