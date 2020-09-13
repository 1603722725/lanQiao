package 剑指;

import org.omg.CORBA.ARG_OUT;
import org.omg.CORBA.VisibilityHelper;
import org.omg.CORBA.WrongTransactionHolder;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wl
 * @Data 2020-07-22 9:57
 */
public class _13_机器人的运动范围 {
    static int m,n,k;
    static boolean[][] visited;
    public static void main(String[] args) {
        int res = movingCount01(16,8,4);
        System.out.println(res);
    }
    // DFS
    public static int movingCount(int m, int n, int k){
        visited = new boolean[m][n];
        return dfs(0,0,0,0);
    }
    public static int dfs(int i, int j, int si, int sj) {
        if(i >= m || j >= n || k < si + sj || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj) + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }
    //BFS
    public static int movingCount01(int m,int n,int k){
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,0,0});
        while (queue.size()>0){
            int[] x = queue.poll();
            int i = x[0],j = x[1],si = x[2],sj = x[3];
            if (i>=m || j>=n || si +sj > k || visited[i][j]) continue;
            visited[i][j] = true;
            res++;
            queue.add(new int[]{i+1,j,(i+1)%10 != 0 ? si+1 : si - 8,sj});
            queue.add(new int[]{i,j+1,si,(j+1)%10 != 0 ? sj+1 : sj - 8});
        }
        return res;
    }
}
