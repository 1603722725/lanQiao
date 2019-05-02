package project;

import java.util.Arrays;
import java.util.Scanner;

public class project01 {
	//POJ 1704  ½×ÌÝÄáÄ·²©ÞÄ
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0){
			n--;
			int m = sc.nextInt();
			int arr[] = new int [m];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(niMu(arr));
		}
	}
	public static String niMu(int A[]){
		int res=0;
		int len = A.length;
		Arrays.sort(A);
		if((len&1)==1){//ÎªÆæÊý
			for (int i = 0; i < A.length; i+=2) {
				res^= (i==0)?(A[0]-1):(A[i]-A[i-1]-1);
			}
		}else{
			for (int i = 1; i < A.length; i+=2){
				res^=(A[i]-A[i-1]-1);
			}
		}
		if(res==0)
			return "Bob will win";
		else
			return "Georgia will win";
	}
}
