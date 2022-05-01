package Day1.CodingNinjasProblems;

import java.util.Scanner;

public class DiamondOfStars {
    private static void solve(int n) {
        for (int i = 0, j = 1; i < n; i++) {
            int startStar = (n - j) / 2;
            int endStar = startStar + j -1;
            for (int k = 0; k < n; k++) {
                if (k >= startStar && k <= endStar)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
            j = i < (n / 2) ? j + 2 : j - 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        Create a pattern like
              *
             ***
            *****
             ***
              *
         */
        solve(n);
    }
}
