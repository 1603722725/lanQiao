package 蓝桥杯;

import java.util.Scanner;
//完全背包问题
public class 包子凑数 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int [n+1];
		for (int i = 1; i <= n; i++) {
			arr[i]=sc.nextInt();
		}
		int yueshu =arr[1];
		for (int i = 2; i <=n; i++) {
			yueshu=Gcd(yueshu, arr[i]);
		}
		if(yueshu!=1){
			System.out.println("INF");
		}else{
			boolean dp[] = new boolean[10010];
			dp[0]=true;
			int sum =0;
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j+arr[i] < 10000; j++) {
					if(dp[j])
						dp[j+arr[i]]=true;
				}
			}
			for (int i = 0; i < 10000; i++) {
				if(dp[i]==false)
					sum++;
			}
			System.out.println(sum);
		}
	}
	
	public static int Gcd(int a,int b){
		return b==0?a:Gcd(b,a%b);
	}
}
