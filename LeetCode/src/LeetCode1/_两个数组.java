package LeetCode1;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.zip.Adler32;

/**
 * @author wl
 * @Data 2020-07-13 16:15
 */
public class _两个数组 {
    public static void main(String[] args) {


    }
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer num:nums1) {
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);
        }
        int arr[] = new int[nums1.length];
        int index = 0;
        for (Integer num:nums2) {
            int count = map.getOrDefault(num,0);
            if (count > 0){
                arr[index++] = num;
                count--;
                if (count>0){
                    map.put(num,count);
                }else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(arr,0,index);
    }
}
