package Day1.Ch6_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CallByReference {
    public static void change(String s, List<Integer> temp) {
        System.out.println("Before changing in change:" + s+temp);
        s = "bkwas";
        temp.add(5);
        System.out.println("After changing in change:" + s+temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> temp = new ArrayList<>(Arrays.asList(1,2,3,4));
        String s = sc.nextLine();
        System.out.println("Before change:" + s + temp);
        change(s,temp);
        System.out.println("After change:" + s + temp);
    }
}
