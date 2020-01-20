package À¶ÇÅ±­;
import java.util.Scanner;
public class ·ÖÇÉ¿ËÁ¦ {
	static int h[] = new int [100000];
	static int w[] = new int [100000];
	static int n,k;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		for (int i = 0; i <n; i++){
			h[i]=sc.nextInt();
			w[i]=sc.nextInt();
		}
		for(int max=1;;max++){
			if(check(max)<k){
				System.out.println(max-1);
				break;
			}
		}
	}
	private static int check(int max){
		int sum=0;
		for (int i = 0; i <n; i++) {
			sum+=(h[i]/max)*(w[i]/max);
		}
		return sum;
	}
}

