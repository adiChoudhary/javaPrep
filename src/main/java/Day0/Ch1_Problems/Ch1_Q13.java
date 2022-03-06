package Day0.Ch1_Problems;

import java.util.Scanner;

public class Ch1_Q13 {
    public static void main(String[] args) {
        double[][] equation = new double[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equations");
        for (int i = 0; i < 2; i++) {
            System.out.printf("Enter the params of %d equation:", i + 1);
            for (int j = 0; j < 3; j++) {
                equation[i][j] = sc.nextDouble();
            }
        }
        double denominator = equation[0][0] * equation[1][1] - equation[0][1] * equation[1][0];
        boolean canBeSolved = denominator != 0;
        if (canBeSolved) {
            double x = (equation[0][2] * equation[1][1] - equation[0][1] * equation[1][2]) / denominator;
            double y = (equation[0][0] * equation[1][2] - equation[0][2] * equation[1][0]) / denominator;
            System.out.printf("x = %.2f and y = %.2f", x, y);
        } else {
            System.out.println("Given equation is unsolvable");
        }
    }
}
