package Day3.HackerRankProblems;

import java.util.Scanner;

public class FindSubstring {
    // Method 1 (without using substring)
    private static String solveOne(String str, int start, int end) {
        // Do not use extra memory if possible
        char[] chArr = str.toCharArray();
        int j = 0;
        for (int i = start; i <= end; i++, j++) {
            chArr[j] = chArr[i];
        }
        return new String(chArr, 0, j);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
//        System.out.println(solveOne(S, start, end - 1));
        System.out.println(S.substring(start,end));
    }
}
