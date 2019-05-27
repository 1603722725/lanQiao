package 决赛;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author 汪磊
 * @date 2019/5/8 - 20:41
 * DFS
 */
public class 路径之谜DFS {
        static int N;
        static int []north; // 正北方靶数
        static int []west;  // 正西方靶数
        static int[][]direction = {{0,-1},{0,1},{-1,0},{1,0}};//上下左右移动方向
        static int[][]mark; //用来标记是否经过某块石头，0为未经过,1为经过
        static int x,y;//石头坐标，正东方向为x轴正方向，正南方向为y轴正方向
        public static void main(String[] args){
            Scanner console = new Scanner(System.in);
            //地面有N*N个方格
            N = console.nextInt();
            //北边以及西边箭靶上的数字
            north = new int[N];
            west = new int[N];
            mark = new int[N][N];
            for(int i = 0; i < N; i++){
                north[i] = console.nextInt();
            }

            for(int i = 0; i < N; i++){
                west[i] = console.nextInt();
            }
            mark[0][0]=1;
            dfs("0");
        }

        public static void dfs(String s){
            if(x>=N-1 && y>=N-1){
                int[] north_count = new int[N];
                int[] west_count = new int[N];
                for(int i = 0; i < N;i++){
                    for(int j = 0; j < N; j++){
                        north_count[i] += mark[i][j];//每列靶子上的箭数
                        west_count[i] += mark[j][i]; //每行靶子上的箭数
                    }
                }
                if(Arrays.equals(north, north_count) && Arrays.equals(west, west_count)){
                    System.out.println(s);
                    return;
                }
            }

            //朝四个方向走
            for(int i = 0; i < 4; i++){
                x += direction[i][0];
                y += direction[i][1];
                int position;
                position = x+N*y;       //石头编号
                String str = s + " "+position;
                if(x>=0 && y>=0 && x<N && y<N &&mark[x][y]==0){
                    mark[x][y]=1;
                    dfs(str);
                    mark[x][y]=0;       //回溯
                }
                x -= direction[i][0];
                y-= direction[i][1];    //回溯
            }
        }

}
