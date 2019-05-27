package 决赛;
import java.util.*;
/**
 * @author 汪磊
 * @date 2019/4/30 - 21:52
 */
public class 生命游戏 {
    static int n=30,m=200;      //数组范围
    static int map[][]=new int[n][m];
    static int temp[][]=new int[n][m];
    static int l;
    static int dx[]={1,1,1,0,0,-1,-1,-1};
    static int dy[]={-1,0,1,1,-1,0,1,-1};
    static int s=2;//以(2,2)为起点
    static int res;
    public static void next(int x,int y,int flag)
    {
        if(flag==1)
        {
            int count=0;
            for(int i=0;i<8;i++)
            {
                if(x+dx[i]>=0 && y+dy[i]>=0 && x+dx[i]<n && y+dy[i]<m &&map[x+dx[i]][y+dy[i]]==1)
                {
                    count++;
                }
            }
            if(count<2)
            {
                temp[x][y]=0;

            }
            else if(count<=3)
            {
                temp[x][y]=map[x][y];

            }
            else if(count>3)
            {
                temp[x][y]=0;
            }
        }
        if(flag==0)
        {
            int count=0;
            for(int i=0;i<8;i++)
            {
                if(x+dx[i]>=0 && y+dy[i]>=0 && x+dx[i]<n && y+dy[i]<m &&map[x+dx[i]][y+dy[i]]==1)
                {
                    count++;
                }
            }

            if(count==3)
            {
                temp[x][y]=1;
            }
        }
    }
    public static void copy()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                map[i][j]=temp[i][j];
            }
        }
    }

    public static void count()
    {
        res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(map[i][j]==1)
                {
                    res++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<11;i++)
        {
            String str=in.next();
            l=str.length();
            for(int j=0;j<l;j++)
            {
                if(str.charAt(j)=='.')
                {
                    map[i+s][j+s]=0;
                }
                if(str.charAt(j)=='X')
                {
                    map[i+s][j+s]=1;
                }
            }
        }

        for(int i=0;i<200;i++)
        {
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<m;y++)
                {
                    next(x,y,map[x][y]);
                }
            }
            copy();
            count();
            System.out.println(res);
        }
    }
}