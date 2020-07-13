package LeetCode1;

/**
 * @author wl
 * @Data 2020-05-11 9:31
 */
public class dp_1277 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}};
        int res = countSquares(arr);
        System.out.println(res);
    }

    /**
     * ����һ�� m * n �ľ��󣬾����е�Ԫ�ز��� 0 ���� 1������ͳ�Ʋ�����������ȫ�� 1 ��ɵ� ������ �Ӿ���ĸ�����
     *
     * @param matrix
     * @return
     */
    public static int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] f = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    f[i][j] = matrix[i][j];
                } else if (matrix[i][j] == 0) {
                    f[i][j] = 0;
                } else {
                    f[i][j] = Math.min(Math.min(f[i][j - 1], f[i - 1][j]), f[i - 1][j - 1]) + 1;
                }
                ans += f[i][j];
            }
        }
        return ans;
    }
}
