package LeetCode1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wl
 * @Data 2020-06-27 10:51
 */
public class _ȱʧ�ĵ�һ������ {
    public static void main(String[] args) {

    }

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = -1;
        for (int i = 0; ; i++) {
            if (!set.contains(i)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
