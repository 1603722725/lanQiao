package leetcode;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-02-26 20:40
 */
public class A {
    public static void main(String[] args) {
        int[] three = new int[12];
        ///digit[60000][13]
        int[][] digit = new int[60000][13];
        three[0] = 1;
        for(int i=1; i<11; i++) three[i] = three[i-1]*3;
        for(int i=0; i<three[10]; i++){
            int tmp = i;
            for(int j=0; j<10; j++){
                digit[i][j] = tmp%3;
                tmp /= 3;
            }
        }
        System.out.println(Arrays.toString(three));
        System.out.println("===========");
        System.out.println(Arrays.toString(digit));
    }
}
