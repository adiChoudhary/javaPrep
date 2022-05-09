package Day2.Ch7_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ch7_Q6 {
    final static int MAX_CNT = (int) (1e6 + 1);

    private static List<Integer> sieveOfEratosthenes(boolean[] dp, int maxNum) {
        List<Integer> primesArr = new ArrayList<>();
        Arrays.fill(dp, true);
        dp[0] = dp[1] = false;
        for (int i = 2; i * i <= maxNum; i++) {
            if (dp[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    dp[j] = false;
                }
            }
        }
        for (int i = 2; i <= maxNum; i++) {
            if(dp[i])
                primesArr.add(i);
        }
        return primesArr;
    }

    private static void printNInOneLine(List<Integer> primesArr, int numOneLine, int n) {
        for (int i = 0; i < n; i++) {
            if ((i + 1) % numOneLine == 0)
                System.out.println(primesArr.get(i)+" ");
            else
                System.out.print(primesArr.get(i)+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean[] dp = new boolean[MAX_CNT];
        List<Integer> primesArr = sieveOfEratosthenes(dp, MAX_CNT - 1);
        System.out.println(primesArr.size());
//        System.out.println(primesArr);
        int numInLine = sc.nextInt();
        int num = sc.nextInt();
        printNInOneLine(primesArr, numInLine, num);
    }
}
