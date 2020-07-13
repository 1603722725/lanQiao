package LeetCode1;

import javax.swing.text.AbstractDocument;

/**
 * @author wl
 * @Data 2020-06-28 9:00
 */
public class _209_������С�������� {
    public static void main(String[] args) {

    }

    public static int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int sum = 0, count = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                count++;
                if (sum >= s) {
                    res = Math.min(res, count);
                    break;
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
