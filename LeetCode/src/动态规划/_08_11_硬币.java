package ¶¯Ì¬¹æ»®;

/**
 * @author wl
 * @Data 2020-08-03 20:52
 */
public class _08_11_Ó²±Ò {
    public static void main(String[] args) {
        int res = waysToChange(6);
        System.out.println(res);
    }
    public static int waysToChange(int n){
        int[] coins = {1,5,10,25};
        int[][] dp = new int[5][n+1];
        for (int i = 1; i <= 4; i++){
            dp[i][0] = 1;
        }
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= n; j++) {
                if (j - coins[i-1]<0){
                    dp[i][j] = dp[i-1][j]%1000000007;
                }else{
                    dp[i][j] = (dp[i-1][j] + dp[i][j - coins[i-1]])%1000000007;
                }
            }
        }
        return dp[4][n];
    }
}
