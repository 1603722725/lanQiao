package Test;

import java.util.Arrays;

public class Test06 {
    //���Ӿ�������ۼӺ�
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[][] = {{1, -6},
                {1, 1},
                {0, 2}};
        System.out.println(f(arr));
    }

    public static int f(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int begin = 0;
        int[] sum = new int[n];
        int max = 0;
        while (begin < m) {
            for (int i = begin; i < arr.length; i++) {
                for (int j = 0; j < n; j++) {
                    sum[j] += arr[i][j];
                }
                int t = Test05.findMax(sum);
                if (t > max)
                    max = t;
            }
            Arrays.fill(sum, 0);
            begin++;
        }
        return max;
    }
}
