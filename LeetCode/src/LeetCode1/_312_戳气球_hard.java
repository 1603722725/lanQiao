package LeetCode1;

import java.util.concurrent.ForkJoinPool;

/**
 * @author wl
 * @Data 2020-07-19 10:12
 */
public class _312_´ÁÆøÇò_hard {
    public static void main(String[] args) {

    }
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] val = new int[n+2];
        int[][] rec = new int[n+2][n+2];
        val[0]=val[n+1]=1;
        for (int i = 1; i <=n; i++) {
            val[i] = nums[i-1];
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = i+2; j <= n+1; j++) {
                for (int k = i+1; k < j; k++) {
                    int sum = val[i]*val[k]*val[j];
                    sum += rec[i][k] + rec[k][j];
                    rec[i][j] = Math.max(sum,rec[i][j]);
                }
            }
        }
        return rec[0][n+1];
    }
}
