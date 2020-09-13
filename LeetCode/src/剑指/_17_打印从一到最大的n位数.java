package 剑指;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-07-28 20:48
 */
public class _17_打印从一到最大的n位数 {
    public static void main(String[] args) {
        int[] arr = printNumbers(3);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] printNumbers(int n) {
        int m = (int) Math.pow(10,n);
        int[] arr = new int[m-1];
        for (int i = 0; i < m-1; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
