package leetcode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wl
 * @Data 2020-02-26 20:40
 */
public class A {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<>((int) Math.pow(2, 30) - 1);
        map.put("1", "12");
        System.out.println(map);
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int a = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (a != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
