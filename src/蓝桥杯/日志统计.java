package 蓝桥杯;
import java.util.Arrays;
import java.util.Scanner;
//日志统计
public class 日志统计 {
	public static void main(String[] args){
		int n,d,k;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		d=sc.nextInt();
		k=sc.nextInt();
		Node arr[]=new Node[n];
		for(int i=0;i<n;i++)
			arr[i]=new Node(sc.nextInt(),sc.nextInt());
		Arrays.sort(arr);
		int curid=arr[0].id;
		int added=0;
		for(int i=0;i<n;i++)
		{			
			if(i+k-1<n && arr[i+k-1].id == curid && arr[i+k-1].ts-arr[i].ts<d && added==0)
				{System.out.println(curid);added=1;}
			else if(arr[i].id!=curid)
			{
				curid=arr[i].id;
				added=0;
				i=i-1;
			}
		}
	
	}
}

class Node implements Comparable<Node>
{
	int ts,id;
	Node(int a,int b)
	{
		ts=a;
		id=b;
	}
	
	@Override
	public int compareTo(Node o){
		if(id == o.id)
			return ts-o.ts;
		else
			return id-o.id;
	}
}