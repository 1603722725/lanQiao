package project;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ÍôÀÚ
 * @date 2019/5/5 - 20:22
 */
public class MN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int q = n/2,qq=0;
        int sum=0;
        for (int i = m-1; i>=0 ; i--) {
            int max = -10000000;
            for (int j = q - 2; j <=q+2 ; j++) {
                if(j<0) j=0;
                if(j>n-1) break;
                if(max < arr[i][j]){
                    max=arr[i][j];
                    qq = j;
                }
            }
            sum += max;
            q=qq;
        }
        System.out.println(sum);
    }


}
