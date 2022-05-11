package Day4.HackerRankProblems;

import java.util.Scanner;

public class RegexChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                String temp = "abc";
                temp.matches(pattern);
                System.out.println("Valid");
            } catch (Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
