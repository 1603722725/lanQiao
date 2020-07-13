package

���ű�;
import java.util.Scanner;

public class �������Ӵ� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(zichuan(str));
        }

private static int zichuan(String str){
        int n=str.length();
        boolean dp[][]=new boolean[n][n];
        int max=0;
        for(int i=0;i<dp.length;i++){
        for(int j=i;j>=0;j--){
        if(str.charAt(i)==str.charAt(j)&&(i-j<2||dp[j+1][i-1]==true)){
        dp[j][i]=true;
        max=Math.max(max,i-j+1);
        }
        }
        }
        return max;
        }
        }
