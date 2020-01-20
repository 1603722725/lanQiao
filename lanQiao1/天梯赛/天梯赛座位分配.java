package 天梯赛;

import java.util.Arrays;
import java.util.Scanner;

public class 天梯赛座位分配 {
	static int a[][];
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
	}
}
