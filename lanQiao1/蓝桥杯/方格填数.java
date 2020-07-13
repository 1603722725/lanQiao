package ���ű�;
public class �������� {
static int vis[]={0};
static int a[][]=new int[5][6];
static int ans=0;
public static void main(String[]args){
        init();
        f(1,2);
        System.out.println(ans);
        }

private static void init(){
        for(int i=0;i<5;i++){
        for(int j=0;j<6;j++){
        a[i][j]=-10;
        }
        }
        }

private static boolean check(int x,int y){
        for(int i=x-1;i<x+1;i++){
        for(int j=y-1;j<y+1;j++){
        if(Math.abs(a[x][y]-a[i][j])==1)
        return false;
        }
        }
        return true;
        }

private static void f(int x,int y){
        if(x==3&&y==4)
        {
        ans++;
        return;
        }
        for(int i=0;i< 10;i++){
        if(vis[i]==0){
        a[x][y]=i;
        if(!check(x,y)){
        a[x][y]=-10;
        continue;
        }
        vis[i]=1;
        if(y==4)
        f(x+1,1);
        else
        f(x,y+1);
        {
        vis[i]=0;
        a[x][y]=-10;
        }

        }
        }
        }

        }
