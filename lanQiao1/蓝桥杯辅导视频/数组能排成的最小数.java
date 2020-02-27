package 蓝桥杯辅导视频;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wl
 * @Data 2020-01-20 22:12
 */
public class 数组能排成的最小数 {
    public static int f(Integer[] arr){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++)
            sb.append(arr[i]);
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        Integer[] arr = {3,32,321,1};
        int res = f(arr);
        System.out.println(res);
    }
}
