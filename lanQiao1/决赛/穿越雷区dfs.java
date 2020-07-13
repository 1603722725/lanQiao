package

����;
import java.util.Scanner;
/**
 * @Author: wl
 * @Date: 2019/5/21 21:14
 */
public class ��Խ����dfs{
static int n;
static int sum=10000;
static char[][]str;
static int[][]arr;
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        str=new char[n][n];
        arr=new int[n][n];
        int AX=0,AY=0;

        for(int i=0;i<n; i++){
        for(int j=0;j<n; j++){
        str[i][j]=sc.next().charAt(0);
        if(str[i][j]=='A'){
        AX=i;
        AY=j;
        }
        }
        }

        DFS(0,AX,AY);
        if(sum==10000)
        System.out.println(-1);
        else{
        System.out.println(sum);
        }
        }

private static void DFS(int cur,int ax,int ay){
        if(cur>=sum)
        return;
        if(str[ax][ay]=='B'){
        sum=cur;
        return;
        }
        arr[ax][ay]=1;
        if(ax-1>=0&&arr[ax-1][ay]==0&&str[ax][ay]!=str[ax-1][ay]){
        DFS(cur+1,ax-1,ay);
        }
        if(ay-1>=0&&arr[ax][ay-1]==0&&str[ax][ay]!=str[ax][ay-1]){
        DFS(cur+1,ax,ay-1);
        }
        if(ax+1<n &&arr[ax+1][ay]==0&&str[ax][ay]!=str[ax+1][ay]){
        DFS(cur+1,ax+1,ay);
        }
        if(ay+1<n &&arr[ax][ay+1]==0&&str[ax][ay]!=str[ax][ay+1]){
        DFS(cur+1,ax,ay+1);
        }
        arr[ax][ay]=0;
        }
        }