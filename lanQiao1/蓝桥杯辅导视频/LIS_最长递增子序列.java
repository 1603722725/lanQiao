package 蓝桥杯辅导视频;

/**
 * @author wl
 * @Data 2020-05-09 20:47
 */
public class LIS_最长递增子序列 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5,6,4,8,9};
        System.out.println(Lcs(arr));
    }
    /**
     * nlog(n)
     * @param arr
     * @return
     */
    static int Lcs(int[] arr){
        int[] dp = new int[arr.length+1];
        dp[1] = arr[0];
        int p = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>dp[p]){
                dp[p+1] = arr[i];
                p++;
            }else{
                //可以用二分法优化
              /*  for (int j = 0; j <= p; j++) {
                    if (dp[j]>arr[i]){
                        dp[j]=arr[i];
                    }
                }*/
               //优化后
                int flag = erfen(dp,arr[i],0,p);
                if (flag!=-1){
                    dp[flag] = arr[i];
                }
            }
        }
        return p;
    }
    static int erfen(int[]dp,int v,int l,int r){
        while (l <= r){
            int mid = (r+l)>>1;
            if (dp[mid]>v){
                r=mid;
            }else {
                l=mid+1;
            }
            if (l==r && dp[mid]>v)
                return l;
        }
        return -1;
    }
}
