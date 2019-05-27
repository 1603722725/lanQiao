package 决赛;

/**
 * @Author: wl
 * @Date: 2019/5/21 8:47
 * 答案  3120
 */
public class 反幻方1 {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 枚举数组
    static int[] vis = new int[arr.length]; //标记数组
    static int[] m = new int[arr.length]; //排列组合 数组
    static int count = 0;

    public static void main(String[] args){
        dfs(0);
        //初8是应为，旋转4个+镜像2个
        System.out.println(count / 8);
    }

    public static void dfs(int k) {
        if (k == arr.length) {
            //下面是检测是否每个位置都不相等
            boolean flag = true;
            int row1 = m[0] + m[1] + m[2];
            int row2 = m[3] + m[4] + m[5];
            int row3 = m[6] + m[7] + m[8];
            int col1 = m[0] + m[3] + m[6];
            int col2 = m[1] + m[4] + m[7];
            int col3 = m[2] + m[5] + m[8];
            int xie1 = m[0] + m[4] + m[8];
            int xie2 = m[2] + m[4] + m[6];
            int[] p = {row1, row2, row3, col1, col2, col3, xie1, xie2};
            for (int i = 0; i < p.length; ++i)   //时间复杂度太高   优化   放set集合
                for (int j = i + 1; j < p.length; ++j) {
                    if (p[i] == p[j]) {
                        flag = false;
                        break;
                    }
                    if (!flag)
                        break;
                }
                if (flag)
                    count++;
                return;
            }
            //这里是试探-回溯的过程，全排列
            for (int i = 0; i < 9; ++i) {
                if (vis[i] == 0) {
                    vis[i] = 1;
                    m[k] = arr[i];
                    dfs(k + 1);
                    vis[i] = 0;
                }
            }
        }
}
