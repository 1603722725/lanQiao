package 蓝桥杯辅导视频;

import javax.sound.midi.Soundbank;

/**
 * @author wl
 * @Data 2020-02-10 22:46
 * 正方形矩阵
 */
public class 边界为1的最大子方阵 {
    static int[][][] rec;
    public static void main(String[] args) {
        int [][] arr = {{1,1,1,1},
                        {1,0,1,0},
                        {1,0,0,1},
                        {1,1,1,1}};
//        int res = solve(arr,4);
//        System.out.println(res);
        getSolve(arr);
        print(arr);
        int res = solve1(arr,arr.length);
        System.out.println(res);
    }

    /**
     * 时间复杂度较高
     * @param matrix
     * @param N
     * @return
     */
    static int solve(int[][] matrix,int N){
        int m=matrix.length;
        int n=matrix[0].length;
        int n1=N;
        while (n1>0) {
            for (int i = 0; i < m; i++) {
                if (i + n1 > N) break;
                l1:for (int j = 0; j < n; j++) {
                        if (j + n1 > N) break;
                        int r = i, c = j;
                        while (c < j + n1) {
                            if (matrix[r][c++] == 0) continue l1;
                        }
                        c--;
                        while (r < i + n1){
                            if (matrix[r++][c]==0) continue l1;
                        }
                        r--;
                        while (c>=j){
                            if (matrix[r][c--]==0) continue l1;
                        }
                        c++;
                        while (r>=i){
                            if (matrix[r--][c]==0) continue l1;
                        }
                        return n1;
                    }
            }
            n1--;
        }
        return 0;
    }

    /**
     * 优化算法
     * @param arr
     */
    static void getSolve(int[][] arr){
        int N = arr.length;
        rec = new int[N][N][2];
        int row = N-1;
        for (int i=N-1;i>=0;i--){
            int value = arr[row][i];
            if (value==1){
                if (i==N-1){
                    rec[row][i][0]=1;
                }else{
                    rec[row][i][0]=rec[row][i+1][0]+1;
                }
                rec[row][i][1]=1;
            }
        }
        row--;
        for (int i=row;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                int value = arr[i][j];
                if (value==1){
                    if (j==N-1){
                        rec[i][j][0]=1;
                    }else{
                        rec[i][j][0]=rec[i][j+1][0]+1;
                    }
                    rec[i][j][1] = rec[i+1][j][1]+1;
                }
            }
        }
    }
    static void print(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(rec[i][j][0]+","+rec[i][j][1]+"\t");
            }
            System.out.println();
        }
    }
    static int solve1(int[][] arr,int N){
        int n=N;
        while (n>0){
            for (int i=0;i<N;i++){
                for (int j=0;j<N;j++){
                    if(check(i,j,n))
                        return n;

                }
            }
            n--;
        }
        return 0;
    }
    static boolean check(int i,int j,int n){
        if(rec[i][j][0]>=n && rec[i][j][1]>=n && rec[i+n-1][j][1]>=0 && rec[i][j+n-1][1]>=n)
            return true;
        return false;
    }
}
