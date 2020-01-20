package 蓝桥杯辅导视频;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-01-14 15:40
 */
public class 最长递增子序列 {
    /**
     * 最长连续递增子序列
     * @param arr
     * @return
     */
    public static int longestIncreasingSubsequence1(int[] arr){
        int begin=0,end=1;
        int max=1;
        while (end<arr.length){
            int count=1;
            boolean flag = true;
            while (flag&&end<arr.length){
                if(arr[begin] < arr[end]){
                    count++;
                    begin=end;
                    end++;
//                    System.out.println(begin+"-"+end);
                }else{
                    flag = false;
                }
            }
            if (count>max) max=count;
            count=1;
            begin=end;
            end=begin+1;
//            System.out.println(begin+"===="+end);
        }
        return max;
    }

    /**
     * 最长递增子序列  可不连续  时间复杂度N2
     * @param arr
     * @return
     */
    public static int longestIncreasingSubsequence2(int[] arr){
        int dp[] = new int[arr.length];
        dp[0]=1;
        for(int i=1;i<arr.length;i++) {
            int cnt = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    cnt = Math.max(cnt, dp[j] + 1);
            }
            dp[i] = cnt;
        }
        int maxV=0;
        for(int i=0;i<arr.length;i++){
            maxV = Math.max(maxV,dp[i]);
        }
        return maxV;
    }

    /**
     * 最长递增子序列  可不连续  时间复杂度nlog(n)
     * @param arr
     * @return
     */
    public static int longestIncreasingSubsequence3(int arr[]){
        int[] dp = new int[arr.length+1];
        dp[1] = arr[0];
        int index = 1;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>dp[index]){
                dp[++index]=arr[i];
            }else{
                int tempIndex=BinarySearch(dp,arr[i],index);
                dp[tempIndex]=arr[i];
            }
        }
        System.out.println(Arrays.toString(dp));
        return index;
    }
    /**
     * 二分查找变体 找到第一个大于n的位置index
     * @param dp
     * @param n
     * @return
     */
    public static int BinarySearch(int[] dp,int n,int len){
        int left=1,right= len;
        while (left<right){
            int mid = (left+right)/2;
            if(dp[mid]>n)
                right=mid;
            else
                left=mid+1;
        }
        return right;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};   //{-1,1,-2,2,-3,3};
//        int n=longestIncreasingSubsequence1(arr);
//        int n=longestIncreasingSubsequence2(arr);
        System.out.println(longestIncreasingSubsequence3(arr));
    }
}
