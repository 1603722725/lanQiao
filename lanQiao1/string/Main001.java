package string;

import java.util.Scanner;

/**
 * @author ����
 * @date 2019/4/11 - 19:23
 */
public class Main001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = f(n) * 2 - n + 2;
        System.out.println(b);
    }

    private static int f(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
