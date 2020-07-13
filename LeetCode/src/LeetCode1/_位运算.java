package LeetCode1;

/**
 * @author wl
 * @Data 2020-06-23 14:28
 */
public class _Œª‘ÀÀ„ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2};
        int res = singleNumber(arr);
        System.out.println(res);
    }

    public static int singleNumber(int[] nums) {
        int seenOnce = 0, seenTwice = 0;
        for (int num : nums) {
            // first appearence:
            // add num to seen_once
            // don't add to seen_twice because of presence in seen_once

            // second appearance:
            // remove num from seen_once
            // add num to seen_twice

            // third appearance:
            // don't add to seen_once because of presence in seen_twice
            // remove num from seen_twice
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }

        return seenOnce;
    }
}
