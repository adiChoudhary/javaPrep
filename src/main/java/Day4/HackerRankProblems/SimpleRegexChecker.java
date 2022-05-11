package Day4.HackerRankProblems;

import java.util.Scanner;

public class SimpleRegexChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String pattern = sc.nextLine();
        System.out.println(word.matches(pattern));
    }
}
