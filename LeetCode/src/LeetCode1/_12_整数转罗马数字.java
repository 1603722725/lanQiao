package LeetCode1;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.*;

/**
 * @author wl
 * @Data 2020-06-22 10:43
 */
public class _12_整数转罗马数字 {
    public static void main(String[] args) {
        String s = intToRoman(123);
    }

    public static String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();
        int index = 0;

        while (index < 13) {
            while (num >= nums[index]) {
                ans.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return ans.toString();
    }
}
