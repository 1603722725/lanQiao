package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-23 8:58
 */
public class _64_最小路径和 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,1},
                {1,5,1},
                {4,2,1}};
        int res = minPathSum(arr);
        System.out.println(res);
    }
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp= new int[m][n];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            ans += grid[i][0];
            dp[i][0] = ans;
        }
        ans = 0;
        for (int i = 0; i < grid[0].length; i++) {
            ans += grid[0][i];
            dp[0][i] = ans;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                if (i>=1 && j>=1)
                dp[i][j] = Math.min((grid[i][j]+dp[i-1][j]),(grid[i][j]+dp[i][j-1]));
            }
        }
        return dp[m-1][n-1];
    }
}
