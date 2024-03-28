import java.util.Scanner;

public class Fibonacci {
    private static int[] memo;

    public static int fib(int n) {
        memo = new int[n + 1]; // Initialize memo array
        return fibMemo(n);
    }

    // Helper function using memoization
    public static int fibMemo(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n]; // If already computed, return stored value
        }
        // Otherwise, compute and store in memo array
        memo[n] = fibMemo(n - 1) + fibMemo(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = fib(n);
        System.out.println(k);

        scanner.close();
    }
}
