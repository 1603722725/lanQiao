package

���ű�������Ƶ;


import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-05-02 17:27
 * Time Limit Exceeded
 */
public class poj3617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        String s = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(sc.next());
        }
        c = sb.toString().toCharArray();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (c[left] < c[right]) {
                s += c[left];
                left++;
            } else if (c[left] == c[right]) {
                int a = 1;
                while (left + a <= right - a) {
                    if (c[left + a] != c[right - a]) {
                        if (c[left + a] > c[right - a]) {
                            s += c[right];
                            right--;
                            break;
                        } else {
                            s += c[left];
                            left++;
                            break;
                        }
                    }
                    a++;
                }
            } else {
                s += c[right];
                right--;
            }
        }
        if (left == right)
            s += c[left];
        System.out.println(s);
    }
}
