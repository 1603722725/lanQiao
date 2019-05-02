package 动态规划;
import java.util.Arrays;
import java.util.Scanner;
public class 区间选点问题 {
	// https://vjudge.net/problem/POJ-1201
	//超时代码
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Interval[] intervals = new Interval[n];
		for (int i = 0; i < n; i++) {
			intervals[i] = new Interval(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(intervals);
		int max = intervals[n-1].t;
		int axis[] = new int[max+1];
		int [] c = new int [max+2];
		for (int i = 0; i < n; i++) {
			int s=intervals[i].s;
			int t=intervals[i].t;
			 int cnt=sum(axis,s,t);
			intervals[i].c-=cnt;
			while(intervals[i].c>0){
				if(axis[t]==0){
					axis[t]=1;
					intervals[i].c--;
					t--;
				}else{
					t--;
				}
			}
		}
		System.out.println(sum(axis,0,max));
	}
	
	private static int sum(int axis[],int s,int t){
		int sum=0;
		for (int i = s; i <=t; i++) {
			sum+=axis[i];
		}
		return sum;
	}
	private static void updateSum(int t,int[]sums){
		for (int i = t; i < sums.length; i++) {
			sums[i]++;
		}
	}
	
	private static class Interval implements Comparable<Interval>{
		int s;
		int t;
		int c;
		public Interval(int s,int t,int c){
			this.s=s;
			this.t=t;
			this.c=c;
		}
		@Override
		public int compareTo(Interval other) {
			int x=this.t-other.t;
			if(x==0)
				return this.t-other.t;
			else
			return x;
		}
		
	}
}
