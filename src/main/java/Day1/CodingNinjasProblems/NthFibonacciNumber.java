package Day1.CodingNinjasProblems;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        // F(n) = F(n-1) + F(n-2)
        int[] fib = new int[]{1, 1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(fib[n - 1]);
        } else {
            for (int i = 2; i < n; i++) {
                int temp = fib[0] + fib[1];
                fib[0] = fib[1];
                fib[1] = temp;
            }
            System.out.println(fib[1]);
        }
    }
}
