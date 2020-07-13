package LeetCode1;

import leetcode.A;

/**
 * @author wl
 * @Data 2020-07-01 9:06
 */
public class _718_最长重复子数组 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 2, 1};
        int[] B = {3, 2, 1, 4, 7};
        int res = findLength(A, B);
        System.out.println(res);
    }

    public static int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) return 0;
        int lenA = A.length;
        int lenB = B.length;
        int ans = 0;
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = lenA - 1; i >= 0; i--) {
            for (int j = lenB - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}