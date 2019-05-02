package 蓝桥杯辅导视频;

import java.util.Arrays;

/**
 * @author 汪磊
 * @date 2019/4/26 - 15:12
 */
public class 有空字符串的字符串数组二分查找 {
    public static int indexOf(String arr[],String p){
        int begin = 0;
        int end = arr.length-1;
        while (begin <= end){
            int indexOfMid = begin+((end-begin)>>1);
            while (arr[indexOfMid].equals("")){
                indexOfMid++;
                if(indexOfMid>end)
                    return -1;
            }
           if(arr[indexOfMid].compareTo(p)>0)
               end = indexOfMid-1;
           else if(arr[indexOfMid].compareTo(p)<0)
               begin = indexOfMid+1;
           else return indexOfMid;
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[] = {"d","s","","f","","dsfgfc"};
        Arrays.sort(arr);
        for(String ss:arr)
            System.out.print(ss+" ");
        int index=indexOf(arr,"f");
        System.out.println(index);
    }
}
