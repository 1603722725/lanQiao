package

��̬�滮;
import java.util.Arrays;
import java.util.Scanner;

public class ���ٹ��� {
//https://vjudge.net/problem/POJ-1700
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n; i++){
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int j=0;j<m; j++){
        arr[j]=sc.nextInt();
        }
        Arrays.sort(arr);
        f(m,arr);
        }
        }
public static void f(int n,int speed[]){
        int left=n;
        int ans=0;
        while(left>0){
        if(left==1){
        ans+=speed[0];
        break;
        }else if(left==2){
        ans+=speed[1];
        break;
        }else if(left==3){
        ans+=speed[0]+speed[1]+speed[2];
        break;
        }else{
        int s1=speed[1]+speed[0]+speed[left-1]+speed[1];
        int s2=speed[left-2]+2*speed[0]+speed[left-1];
        ans+=Math.min(s1,s2);
        left-=2;
        }
        }
        System.out.println(ans);
        }
        }
	 