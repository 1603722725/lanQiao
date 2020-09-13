package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-17 17:32
 */
public class _35_ËÑË÷²åÈëµÄÎ»ÖÃ {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                res = i;
                break;
            }
            if (i == nums.length -1 && target > nums[nums.length-1]){
                res = nums.length;
            }
        }
        return res;
    }

}
