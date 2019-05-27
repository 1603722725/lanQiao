package 决赛;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @Author: wl
 * @Date: 2019/5/24 8:17
 */
public class 排列序数dfs {
    static char arr[];
    static char a[];
    static int count = 0;
    static boolean flag[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        arr = s.toCharArray();
        Arrays.sort(arr);
        a = new char[arr.length];
        flag = new boolean[arr.length];
        dfs(s, 0);
    }

    public static void dfs(String s, int n) {
        if (n == arr.length) {
            if (s.equals(String.valueOf(a))) {
                System.out.println(count);

            }
            count++;
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                a[n] = arr[i];
                dfs(s, n + 1);
                flag[i] = false;
            }
        }
    }
}
