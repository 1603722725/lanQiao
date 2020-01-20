package 历届试题;
import java.util.Scanner;
public class 分考场 {
	static boolean[][] know;//是否熟悉
	static int[][] examRoom;//考场安排
	static int res = 101,n;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		know = new boolean[n+1][n+1];
		examRoom = new int[n][n+1];
		int m = cin.nextInt();
		for(int i=0;i<m;i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			know[a][b]=know[b][a]=true;
		}
		dfs(1,0);
		System.out.println(res);
		cin.close();
	}
	static void dfs(int examineeId,int examRoomAmo) {
		//考场的数量大于或等于出现过的最小的考场数量，别看了，再弄也大了
		if(examRoomAmo>=res) return ;
		//当我们的考生编号大于考生人数,所有考生都安排好了
		if(examineeId>n) {
			res = Math.min(res, examRoomAmo);//这时候记录最小的考场数量
			return;
		}
 
		A:for(int i=0;i<examRoomAmo;i++) {	//遍历已经开辟的每个考场
			int examineeAmo = examRoom[i][n];//当前考场的最后一位存放当前考场的考生数量
			int j;
			for(j=0;j<examineeAmo;j++) {	//遍历当前考场中每个考生，判断是否认识
				if(know[examRoom[i][j]][examineeId]) {//如果两个考生认识
					continue A;		//跳到下一个考场
				}
			}
			if(j==examineeAmo){
				//当前考场的考生与我们的考生都不认识，把我们的考生加入当前考场
				examRoom[i][examRoom[i][n]++] = examineeId;
				//dfs判断下一个考生放在哪个考场
				dfs(examineeId+1,examRoomAmo);
				//消除我们上一步的dfs对这次造成影响
				examRoom[i][n]--;
			}
		}
		//前边每个考场都认识，新建考场
		//把我们的考生放在新考场的第一个位置，新考场考生数量+1
		examRoom[examRoomAmo][examRoom[examRoomAmo][n]++] = examineeId;
		dfs(examineeId+1,examRoomAmo+1);//dfs下一个考生
		--examRoom[examRoomAmo][n];//消除影响
	}
}