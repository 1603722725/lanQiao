package LeetCode1;

import com.sun.javafx.robot.FXRobotImage;

import java.util.Map;

/**
 * @author wl
 * @Data 2020-08-03 19:45
 */
public class _1139_������1Ϊ�߽�������� {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int res = largest1BorderedSquare(arr);
        System.out.println(res);
    }
    public static int largest1BorderedSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m+1][n+1][2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (grid[i-1][j-1] == 1){
                    dp[i][j][0] = 1 + dp[i][j-1][0];
                    dp[i][j][1] = 1 + dp[i-1][j][1];
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n; j++) {
                for (int size = Math.min(dp[i][j][0],dp[i][j][1]);size>=1;size--){
                    if (dp[i][j-size+1][1] >= size && dp[i-size+1][j][0]>=size){
                        res = Math.max(res,size);
                        break;
                    }
                }
            }
        }
        return res*res;
    }
}
