package

��̬�滮;
import java.util.Scanner;

public class  ���� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[][]=new int[405][405];
        int a[][]=new int[405][405];
        for(int i=0;i<n; i++){
        for(int j=0;j<=i;j++){
        a[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<n; i++){
        dp[n-1][i]=a[n-1][i];
        }
        for(int i=n-2;i>=0;i--){
        for(int j=0;j<=i;j++){
        dp[i][j]=a[i][j]+Math.max(dp[i+1][j],dp[i+1][j+1]);
        }
        }
        System.out.println(dp[0][0]);
        }
        }
