package Day2.Ch7_Problems;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] srcArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] destArr = new int[10];
        System.arraycopy(srcArr,3,destArr,5,4);
        System.out.println(Arrays.toString(destArr));
    }
}
