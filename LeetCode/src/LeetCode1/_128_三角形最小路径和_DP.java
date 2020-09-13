package LeetCode1;

import java.util.List;

/**
 * @author wl
 * @Data 2020-07-14 10:10
 */
public class _128_三角形最小路径和_DP {
    public static void main(String[] args) {
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] arr = new int[n][n];
        arr[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            arr[i][0] = arr[i-1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                arr[i][j] = Math.min(arr[i-1][j],arr[i-1][j-1]) + triangle.get(i).get(j);
            }
            arr[i][i] = arr[i-1][i-1] = triangle.get(i).get(i);
        }
        int ans = arr[n-1][0];
        for (int i = 1; i < n; i++) {
            ans = Math.min(ans,arr[n-1][i]);
        }
        return ans;
    }
}
