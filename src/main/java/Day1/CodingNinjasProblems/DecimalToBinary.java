package Day1.CodingNinjasProblems;

import java.util.Scanner;

public class DecimalToBinary {
    private static StringBuilder solve(int decimal) {
        StringBuilder str = new StringBuilder("");
        if(decimal == 0){
            return str.insert(0, 0);
        }
        while (decimal!=0) {
            int digit = decimal % 2;
            str.insert(0, digit);
            decimal /= 2;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
