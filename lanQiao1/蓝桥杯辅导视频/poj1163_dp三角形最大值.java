package

���ű�������Ƶ;

import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-05-07 21:28
 */
public class poj1163_dp���������ֵ {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
        for(int i=0;i<n; i++){
        for(int j=0;j<=i;j++){
        arr[i][j]=sc.nextInt();
        }
        }
        int rs=maxSumTriangle(arr);
        System.out.println(rs);
        }
static int maxSumTriangle(int[][]triangle){
        int rowCount=triangle.length;
        int colCount=triangle[rowCount-1].length;
        int[]dp=new int[colCount];
        for(int i=0;i<colCount; i++){
        dp[i]=triangle[rowCount-1][i];
        }
        for(int i=rowCount-2;i>=0;i--){
        for(int j=0;j<=i;j++){
        dp[j]=triangle[i][j]+Math.max(dp[j],dp[j+1]);
        }
        }
        return dp[0];
        }

        }
