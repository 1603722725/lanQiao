package LeetCode1;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-06-29 8:53
 */
public class _215_�����е�K��Ԫ�� {
    public static void main(String[] args) {

    }

    public static int findKthLargest(int[] nums, int k) {
//        if (k > nums.length)
////            return -1;
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
