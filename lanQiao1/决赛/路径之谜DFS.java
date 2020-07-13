package

����;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author ����
 * @date 2019/5/8 - 20:41
 * DFS
 */
public class ·��֮��DFS{
static int N;
static int[]north; // ����������
static int[]west;  // ����������
static int[][]direction={{0,-1},{0,1},{-1,0},{1,0}};//���������ƶ�����
static int[][]mark; //��������Ƿ񾭹�ĳ��ʯͷ��0Ϊδ����,1Ϊ����
static int x,y;//ʯͷ���꣬��������Ϊx�����������Ϸ���Ϊy��������
public static void main(String[]args){
        Scanner console=new Scanner(System.in);
        //������N*N������
        N=console.nextInt();
        //�����Լ����߼����ϵ�����
        north=new int[N];
        west=new int[N];
        mark=new int[N][N];
        for(int i=0;i<N; i++){
        north[i]=console.nextInt();
        }

        for(int i=0;i<N; i++){
        west[i]=console.nextInt();
        }
        mark[0][0]=1;
        dfs("0");
        }

public static void dfs(String s){
        if(x>=N-1&&y>=N-1){
        int[]north_count=new int[N];
        int[]west_count=new int[N];
        for(int i=0;i<N;i++){
        for(int j=0;j<N; j++){
        north_count[i]+=mark[i][j];//ÿ�а����ϵļ���
        west_count[i]+=mark[j][i]; //ÿ�а����ϵļ���
        }
        }
        if(Arrays.equals(north,north_count)&&Arrays.equals(west,west_count)){
        System.out.println(s);
        return;
        }
        }

        //���ĸ�������
        for(int i=0;i< 4;i++){
        x+=direction[i][0];
        y+=direction[i][1];
        int position;
        position=x+N*y;       //ʯͷ���
        String str=s+" "+position;
        if(x>=0&&y>=0&&x<N &&y<N &&mark[x][y]==0){
        mark[x][y]=1;
        dfs(str);
        mark[x][y]=0;       //����
        }
        x-=direction[i][0];
        y-=direction[i][1];    //����
        }
        }

        }
