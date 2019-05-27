package 决赛;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
/**
 * @Author: wl
 * @Date: 2019/5/15 23:48
 */
public class 整理玩具 {
    static Set<Integer> set = new HashSet<Integer>();
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            for (int j = 0; j < m; j++) {
                String str = sc.next();
                for (int k = 0; k < n; k++) {
                    a[j][k] = str.charAt(k) - '0';
                    set.add(a[j][k]);
                }
            }
//            System.out.println(set);
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int cur = it.next();
//                System.out.println(cur);
                f(a, cur);
            }
//            System.out.println(set);
//            System.out.println(sum);
            if (sum == m * n)
                System.out.println("Yes");
            else
                System.out.println("NO");
            sum=0;
        }
    }

    public static void f(int[][] arr, int cur) {
        int r1 = arr.length - 1;
        int c1 = arr[0].length - 1;
        int r2 = 0;
        int c2 = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == cur) {
                    if(r1>=i && c1>=j){
                        r1=i;
                        c1=j;
                    }
                    if(r2<=i && c2<=j){
                        r2 = i;
                        c2 = j;
                    }
                }
            }
        }
//        System.out.println(r1 + "  " + c1 + "  " + r2 + "  " + c2);
        if (r1 == r2)
            sum += c2 - c1 + 1;
        else if (c1 == c2)
            sum += r2 - r1 + 1;
        else
            sum += (r2 - r1 + 1) * (c2 - c1 + 1);

    }
}