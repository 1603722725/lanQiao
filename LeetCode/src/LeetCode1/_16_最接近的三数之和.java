package LeetCode1;

import java.time.chrono.IsoChronology;
import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-06-24 9:12
 */
public class _16_最接近的三数之和 {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int res = threeSumClosest(nums, target);
        System.out.println(res);
    }

    /**
     * 超时  limitime
     *
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest1(int[] nums, int target) {
        if (nums.length == 3) return nums[0] + nums[1] + nums[2];
        int length = nums.length;
        int n = length * (length - 1) * (length - 2) / (6);
        int[] arr = new int[n];
        int x = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    arr[x] = nums[i] + nums[j] + nums[k];
                    x++;
                }
            }
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target && i > 0 || i == n - 1) {
                res = Math.abs(target - arr[i]) > Math.abs(target - arr[i - 1]) ? arr[i - 1] : arr[i];
                break;
            }
        }
        return res;
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }
                if (sum > target) end--;
                else if (sum < target) start++;
                else
                    return ans;
            }
        }
        return ans;
    }
}
