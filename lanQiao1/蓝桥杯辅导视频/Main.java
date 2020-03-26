package 蓝桥杯辅导视频;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author 汪磊
 * @date 2019/4/24 - 21:32
 */
import java.util.Scanner;
public class Main {
    static int a[];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        sc.close();
        String ss[]=s.split(" ");
        a =new int[ss.length];
        for(int i=0;i<ss.length;i++) {
            a[i]=Integer.parseInt(ss[i]);
        }
        for(int i=0;i<a.length-1;i++) {
            int org=a[i];//依次选一个和尚
            for(int j=a[i]+1;j<a[i+1];j++) {//遍历小和尚可以走的路
                a[i]=j;
                if(check()) {
                    System.out.println(org+" "+a[i]);
                    return;
                }
            }
            //回溯
            a[i]=org;
        }
        System.out.println("-1");
    }
    private static boolean check() {//检查当前情形是否能赢
        int one[] =new int[32];
        int maxlen =0;
        for(int i=0;i<a.length-1;i+=2) {//将两个小和尚分为一组
            String temp=Integer.toBinaryString(a[i+1]-a[i]-1);
            int len =temp.length();
            if(len>maxlen) maxlen =len;
            for(int j=len-1;j>=0;j--) {
                if(temp.charAt(j)=='1') {
                    one[len-j-1] +=1;
                }
            }
        }
        for(int i=0;i<maxlen;i++) {
            if(one[i]%2!=0) {//如果有一列1的个数不为偶数，我必输
                return false;
            }
        }
        return true;//否则我就赢
    }
}