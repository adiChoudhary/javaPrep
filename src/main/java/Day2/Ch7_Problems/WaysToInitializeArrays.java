package Day2.Ch7_Problems;

import java.util.Arrays;

public class WaysToInitializeArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // Using fill method of Arrays
        Arrays.fill(arr, 300);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 0, 2, 20);
        System.out.println(Arrays.toString(arr));

        // Using copyOf
        int[] temp = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(temp));

        // Using Arrays.setall
        System.out.println(Arrays.toString(arr));
        // p here is for index
        Arrays.setAll(arr, p -> arr[p] == 300 ? 1 : 0);
        System.out.println(Arrays.toString(arr));
    }
}
