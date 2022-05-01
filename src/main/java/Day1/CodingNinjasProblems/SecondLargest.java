package Day1.CodingNinjasProblems;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (largest < x) {
                secondLargest = largest;
                largest = x;
            } else if (secondLargest < x && x < largest) {
                secondLargest = x;
            }
        }
        System.out.println(secondLargest);
    }
}
