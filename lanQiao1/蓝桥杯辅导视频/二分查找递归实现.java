package À¶ÇÅ±­¸¨µ¼ÊÓÆµ;

import java.util.Arrays;

/**
 * @author ÍôÀÚ
 * @date 2019/4/22 - 22:59
 */
public class ¶ş·Ö²éÕÒµİ¹éÊµÏÖ {
    public static int binsrySearch(int arr[],int low,int high,int key){
        if(low>high) return  -1;
        int mid = low+(high-low)/2;
        if(arr[mid]>key)
            return binsrySearch(arr,low,mid-1,key);
        else if (arr[mid]<key)
            return binsrySearch(arr,mid+1,high,key);
        else
            return mid;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,3,7,4,8,4,9,11,10};
        int len =arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n=binsrySearch(arr,0,len-1,4);
        System.out.println(n);
    }
}
