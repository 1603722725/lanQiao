package 蓝桥杯辅导视频;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-03-09 21:32
 */
public class 天平秤重 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }
    static void solve(int n){
        String str = Integer.toString(n,3);
        List<Integer> list = new ArrayList<>();
        char[] c = new StringBuilder(str).reverse().toString().toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='3'){
                list.add(0);
                if (i==c.length-1){
                    list.add(1);
                }else {
                    c[i+1]++;
                }
            }else if (c[i]=='2'){
                list.add(-1);
                if (i==c.length-1){
                    list.add(1);
                }else {
                    c[i+1]++;
                }
            }else {
                list.add(c[i]-'0');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size()-1; i >=0 ; i--) {
            if (list.get(i)==1){
                sb.append('+').append((int)Math.pow(3,i));
            }
            if (list.get(i)==-1){
                sb.append('-').append((int)Math.pow(3,i));
            }
        }
        System.out.println(sb.toString().substring(1));
    }
}
