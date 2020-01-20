package Àú½ìÊÔÌâ;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[32];
		for (int i = 0; i < 32; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			String s = Integer.toBinaryString(a[i]);
			int len=s.length();
			for (int j = 0; j <16-len; j++) {
				System.out.print(0);
			}
			System.out.print(s);
			if(i%2==1)
				System.out.println();
		}
	}
}
