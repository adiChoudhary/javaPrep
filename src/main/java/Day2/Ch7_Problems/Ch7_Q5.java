package Day2.Ch7_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Ch7_Q5 {
    private static boolean contains(int[] arr, int ele) {
        for (int j : arr) {
            if (ele == j)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0, j = 0; i < 10; i++) {
            int x = sc.nextInt();
            if (contains(Arrays.copyOfRange(arr, 0, j), x)) {
                arr[j] = x;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
