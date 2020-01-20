package 天梯赛;

import java.util.Scanner;

public class 打折数 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[] = new int [3] ;
		int a1=0,b1=0;
		for (int i = 0; i < arr.length; i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0)
				a1++;
			else
				b1++;
		}
		
		if(a>b && a1!=0)
			System.out.println("The winner is a: "+a+" + "+a1);
		else
			System.out.println("The winner is b: "+b+" + "+b1);
	}
}
