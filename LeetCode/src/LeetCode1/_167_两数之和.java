package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-20 22:47
 */
public class _167_两数之和 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target) break;
            int ans = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (ans == numbers[j]){
                    a[0] = i+1;
                    a[1] = j+1;
                }
            }
        }
        return a;
    }
}
