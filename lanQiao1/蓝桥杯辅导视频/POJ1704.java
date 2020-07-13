package

���ű�������Ƶ;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-03-10 9:45
 * nim����
 */
public class POJ1704 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n][];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            data[i] = new int[k];
            for (int j = 0; j < k; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            String res = deal(data[i]);
            System.out.println(res);
        }
    }

    static String deal(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        int res = 0;
        if ((len & 1) == 1) {   //����
            for (int i = 0; i < len; i += 2) {
                res ^= (i == 0) ? (A[i] - 1) : (A[i] - A[i - 1] - 1);
            }
        } else {
            for (int i = 1; i < len; i++) {
                res ^= (A[i] - A[i - 1] - 1);
            }
        }
        if (res == 0) {
            return "Bob will win";
        } else {
            return "Georgia will win";
        }
    }
}
