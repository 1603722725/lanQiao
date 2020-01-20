package 天梯赛;

import java.util.Scanner;

/**
 * @author 汪磊
 * @date 2019/4/3 - 22:07
 */
public class zz的难题 {
    static long []a = new long[51];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        for (int i = 4; i <= 50; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        while (true) {
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
