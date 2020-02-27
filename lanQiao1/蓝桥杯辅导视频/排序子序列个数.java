package 蓝桥杯辅导视频;

import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-01-20 11:12
 * 计算数组  排序子序列个数
 */
public class 排序子序列个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++) {
            data[i]=scanner.nextInt();
        }
        int flag = 0;
        int result = 1;
        for(int i = 1; i < n; i++) {
            if(data[i]>data[i-1]){
                if(flag==0) {
                    flag = 1;
                }
                if(flag==-1) {
                    flag = 0;
                    result++;
                }
            }else if(data[i]<data[i-1]){
                if(flag == 0) {
                    flag = -1;
                }
                if(flag == 1) {
                    flag = 0;
                    result++;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
