package 蓝桥杯辅导视频;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-02-12 23:03
 */
public class 矩阵最大累加和 {
    public static void main(String[] args) {
        int[][] arr = {{1,-1,2,-3},
                        {0,2,-2,-3},
                        {-5,0,-5,-10}};
        int max = maxSum(arr);
        System.out.println(max);
    }
    static int maxSum(int[][] matrix){
        int M = matrix.length;
        int N = matrix[0].length;
        int[] sums = new int[N];
        int row=0,max = 0;
        while (row<M){
            for (int i=row;i<M;i++){
                for (int j=0;j<N;j++){
                    sums[j]+=matrix[i][j];
                }
                int t=sumArray(sums);
                if (t>max)
                    max = t;
            }
            Arrays.fill(sums,0);
            row++;
        }
        return max;
    }
    static int sumArray(int[] arr){
        int left=0,right=0;
        int sum = arr[0],max=0;
        for (int i=1;i<arr.length;i++){
            if (sum>0)
                sum+=arr[i];
            else
                sum=arr[i];
            if (sum>max)
                max=sum;
        }
        return max;
    }
}
