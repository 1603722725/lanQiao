package

���ű�;
import java.util.Scanner;

public class K������ {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n; i++)
        a[i]=sc.nextInt();
        a[0]=a[0]%k;
        for(int i=1;i<n; i++)
        a[i]=((a[i]%k)+a[i-1])%k;
        long sum=0;
        int b[]=new int[n+1];
        for(int i=0;i<n; i++){
        sum+=b[a[i]];
        b[a[i]]++;
        }
        System.out.println(sum+b[0]);
        }
        }

	
	/*public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int k=sc.nextInt();
		int a[] = new int [n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for (int i = 0; i < n; i++) {
			int sum1=0;
			for (int j = i; j < n; j++) {
				sum1+=a[j];
				if(sum1%k==0)
					count++;
			}
		}
		System.out.println(count);
	}*/
	
