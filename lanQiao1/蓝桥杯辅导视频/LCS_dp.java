package 蓝桥杯辅导视频;

import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

/**
 * @author wl
 * @Data 2020-05-07 21:56
 * 最长公共子序列
 */
public class LCS_dp {
    public static void main(String[] args) {
        //35778
        /*System.out.println(dfs("123546487979","46879214"));
        System.out.println(solution("123546487979","46879214"));*/
        System.out.println(dfs("13456778","357486782"));
        System.out.println(solution("13456778","357486782"));
    }

    /**
     * 多层递归
     * @param s1
     * @param s2
     * @return
     */
    static ArrayList<Character> dfs(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0; i < len1; i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)){
                    list.add(s1.charAt(i));
                    list.addAll(dfs(s1.substring(i+1),s2.substring(j+1)));
                    break;
                }
            }
            if (list.size()>ans.size()){
                ans = list;
            }
        }
        return ans;
    }
    static String solution(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int [][]dp = new int[len1+1][len2+1];
        int flag = 0;
        //初始化第一列
        for (int i = 1; i <=len1; i++) {
            if (flag == 1){
                dp[i][1] = 1;
            }else if (s1.charAt(i-1) == s2.charAt(0)){
                dp[i][1] = 1;
                flag = 1;
            }else {
                dp[i][1] = 0;
            }
        }
        //初始化第一行
        flag = 0;
        for (int i = 1; i <=len2; i++) {
            if (flag == 1){
                dp[1][i] = 1;
            }else if (s2.charAt(i-1) == s1.charAt(0)){
                dp[1][i] = 1;
                flag = 1;
            }else {
                dp[1][i] = 0;
            }
        }
        for (int i = 2; i <= len1; i++) {
            for (int j = 2; j <=len2; j++) {
                int max = Math.max(dp[i-1][j],dp[i][j-1]);
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = Math.max(max,dp[i-1][j-1]+1);
                }else {
                    dp[i][j] = max;
                }
            }
        }
        return parseDp(dp,s1,s2);
    }

    private static String parseDp(int[][] dp, String s1, String s2) {
        int M = s1.length();
        int N = s2.length();
        StringBuilder sb = new StringBuilder();
        while (M>0 && N>0){
            if (dp[M][N]>Math.max(dp[M-1][N],dp[M][N-1])){
                sb.insert(0,s1.charAt(M-1));
                M--;
                N--;
            }else {
                if (dp[M-1][N]>dp[M][N-1]){
                    M--;
                }else {
                    N--;
                }
            }
        }
        return sb.toString();
    }
}
