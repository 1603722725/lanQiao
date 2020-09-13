package LeetCode1;

import com.sun.org.apache.regexp.internal.RE;

import javax.swing.text.StyledEditorKit;
import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-07-16 18:10
 */
public class _785_判断二分树 {
//    public static void main(String[] args) {
//
//    }
    //深度优先搜索
    private int UNCOLOR = 0;
    private int RED = 1;
    private int GREEN = 2;
    private int[] color;
    private boolean valid;
    public boolean isBipartite(int[][] graph){
        int n = graph.length;
        valid = true;
        color = new int [n];
        Arrays.fill(color,UNCOLOR);
        for (int i = 0; i < n && valid; i++) {
            if (color[i] == UNCOLOR){
                dfs(i,RED,graph);
            }
        }
        return valid;
    }
    public void dfs(int node,int c,int[][]graph){
        color[node] = c;
        int c1 = c == RED ? GREEN : RED;
        for (int ne:graph[node]) {
            if (color[ne] == UNCOLOR){
                dfs(ne,c1,graph);
                if (!valid)
                    return;
                }else if(color[ne] != c1){
                    valid = false;
                    return;
                }
            }
        }

        //广度优先搜索


}
