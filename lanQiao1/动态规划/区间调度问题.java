package 动态规划;
import java.util.Arrays;
import java.util.Scanner;
public class 区间调度问题 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int s[] = new int[n];
		int t[] =new int [n];
		Job [] jobs = new Job[n];
		for (int i = 0; i < n; i++) {
			s[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			t[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			jobs[i]= new Job(s[i],t[i]);
		}
		Arrays.sort(jobs);
		int res = f(n,jobs);
		System.out.println(res);
	}
	private static int f(int n,Job[]jobs){
		int cnt=1;
		int y=jobs[0].t;
		for (int i = 0; i <n; i++) {
			if(jobs[i].s>y){
				cnt++;
				y=jobs[i].t;
			}
		}
		return cnt;
	}
	
	private static class Job implements Comparable<Job>{
		int s;
		int t;
		public Job(int s,int t){
			this.s=s;
			this.t=t;
		}
		
		@Override
		public int compareTo(Job other) {
			int x=this.t-other.t;
			if(x==0)
				return this.s-other.s;
			else
			return x;
		}
	}
}
