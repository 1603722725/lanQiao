package

���ű�;

import java.util.Scanner;

public class ȫ���ů{
static int n,map[][],vis[][];
static boolean dfs(int i,int j)
        {
        if(i<0||i>=n||j<0||j>=n||vis[i][j]==1)return false;
        vis[i][j]=1;
        boolean f=false;
        if(map[i][j+1]==1&&map[i][j-1]==1&&map[i-1][j]==1&&map[i+1][j]==1)
        f=true;
        return dfs(i,j+1)||dfs(i,j-1)||dfs(i+1,j)||dfs(i-1,j)||f;
        }
public static void main(String args[])
        {
        int r=0,t=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        map=new int[n][n];
        vis=new int[n][n];
        for(int i=0;i<n;i++)
        {
        String s=sc.next();
        for(int j=0;j<n;j++)
        if(s.charAt(j)!='.')
        map[i][j]=1;
        else
        vis[i][j]=1;
        }

        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        if(vis[i][j]!=1)
        {
        r++;
        t+=dfs(i,j)?1:0;

        }

        System.out.println(r-t);
        }
        }
