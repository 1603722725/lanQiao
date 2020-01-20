package 练习系统;

import java.util.Scanner;
public class 带分数 {
	static int ans= 0;
	static int n= 0;
	static boolean isVisit[] = new boolean[10];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				if (9-i-j>=1) {
					bfs(0,0,0,i,j,9-i-j);
				}
				
			}
		}
		System.out.println(ans);
	}
	
	private static void bfs(int a, int b, int c, int alen, int blen, int clen) {
		if(alen==0 && blen==0 && clen==0){
			if(b%c==0 && b/c == (n-a)) ans++;
			return;
		}
		
		for (int i = 1; i < 10; i++) {
			if(!isVisit[i]){
				isVisit[i]=true;
			if(0<alen)
				bfs(a*10+i,b, c, alen-1, blen, clen);
			else if(0<blen)
				bfs(a, b*10+i, c, alen, blen-1, clen);
			else if(0<clen)
				bfs(a, b, c*10+i, alen, blen, clen-1);
				isVisit[i]=false;
			}
		}
	}
}
