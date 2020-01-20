package Àú½ìÊÔÌâ;

import java.util.Scanner;

public class ÒûÁÏ»»¹º {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		f(n);
		System.out.println(sum+n);
	}

	private static void f(int n) {
		boolean flag=true;
		while(flag){
		if(n>=3){
			sum += n/3;
			n=n/3+n%3;
		}else
			flag=false;
		}
	}
}
