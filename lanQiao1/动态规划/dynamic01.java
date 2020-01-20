package ¶¯Ì¬¹æ»®;

import java.util.Scanner;

public class dynamic01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(solve(m, n));
	}
	public static int solve(int m,int n){
		int data[][] = new int [m+1][n+1];
		for(int i=1;i<=n;i++){
			data[1][i]=1;
		}
		for(int i=1;i<=m;i++){
			data[i][1]=1;
		}
		for(int i = 2 ;i<=m;i++){
			for(int j=2;j<=n;j++){
				data[i][j] = data[i][j-1]+data[i-1][j];
			}
		}
		return data[m][n];
	}
}
