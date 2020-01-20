package Test;
//找边界位1的最大子方阵
public class Test03 {
	public static void main(String[] args) {
		int [][]a={ {1,1,1,1,1},
					{1,0,1,0,1},
					{1,1,0,0,0},
					{1,0,1,0,1},
					{1,1,1,1,1}};
		System.out.println(f(a));
	}
	
	public static int f(int[][]arr){
		int N=arr.length;
		int n=N;
		int a=0;
		while(n>0){
			for(int i = 0; i < N; i++){
				if(i+n>N) break;
			l3:
				for(int j=0;j<N;j++){
					if(j+n>N) break;
					int r=i,c=j;
					//上
					while(c<j+n){
						if(arr[r][c++]==0) continue l3;
					}
					c--;
					//右
					while(r<i+n){
						if(arr[r++][c]==0) continue l3;
					}
					r--;
					while(c>=j){
						if(arr[r][c--]==0) continue l3;
					}
					c++;
					while(r>=i){
						if(arr[r--][c]==0) continue l3;
					}
					r++;
					a = n;
				}
			}
			if(a>0) break;
			n--;
		}
		return a;
	}
}
