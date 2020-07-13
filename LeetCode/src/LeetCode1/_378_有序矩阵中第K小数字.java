package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-02 9:11
 */
public class _378_有序矩阵中第K小数字 {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}};
        int res = kthSmallest(arr, 5);
        System.out.println(res);
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int row = k / n;
        int col = k % n;
        if (col == 0) return matrix[row - 1][n - 1];
        return matrix[row][col - 1];
    }
}
