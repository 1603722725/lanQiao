package Test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		HanNuo(3, 'a', 'b', 'c');
	}
	public static void HanNuo(int n,char a,char b,char c){
		int count = 1;
		if(n==1){
			System.out.println(count++ +a+"->"+c);
		}else{
			HanNuo(n-1, a, c, b);
			System.out.println(count++ +a+"->"+c);
			HanNuo(count, b, a, c);
		}
	}
}
