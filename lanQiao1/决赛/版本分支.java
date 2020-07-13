package

����;
import java.util.Scanner;
/**
 * @Author: wl
 * @Date: 2019/5/16 21:52
 * �ݹ�
 */
public class �汾��֧ {
static int a[];
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        a=new int[N+1];
        for(int i=1;i<N;i++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        a[v]=u;
        }
        boolean b[]=new boolean[Q];
        for(int i=0;i<Q; i++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        b[i]=show(x,y);
        }
        for(int i=0;i<Q; i++){
        if(b[i])
        System.out.println("YES");
        else
        System.out.println("NO");
        }
        }

public static boolean show(int x,int y){       //xΪ��    yΪ��
        if(a[y]==x||x==y)
        return true;
        else if(a[y]==1)
        return false;
        else
        return show(x,a[y]);
        }
        }
