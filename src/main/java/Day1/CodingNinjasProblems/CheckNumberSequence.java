package Day1.CodingNinjasProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        // Input
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        // Logic
        /*
        Use toggle for increasing and decreasing
            toggle = 0 for increasing
            toggle = 1 for decreasing
         */
        int prev = list.get(0);
        int cur = list.get(1);
        int toggle, toggleTimes = 0;
        boolean res = true;
        if (prev != cur) {
            toggle = prev < cur ? 0 : 1;
            for (int i = 2; i < list.size(); i++) {
                prev = cur;
                cur = list.get(i);
                int curToggle = prev < cur ? 0 : 1;
                toggleTimes = curToggle == toggle ? toggleTimes : toggleTimes + 1;
                toggle = curToggle;
                if(prev == cur || toggleTimes > 1){
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }
        System.out.println(res);
    }
}
