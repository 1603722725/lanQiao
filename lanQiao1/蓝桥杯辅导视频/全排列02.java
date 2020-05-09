package 蓝桥杯辅导视频;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author wl
 * @Data 2020-04-17 14:41
 */
public class 全排列02 {
    static ArrayList<String> res = new ArrayList<>();
    public static void main(String[] args){
        String str = "1423";
        char[] c = str.toCharArray();
        Arrays.sort(c);
        getPermutation(c,0);
        System.out.println(res.size());
        System.out.println(res);
    }
    public static void getPermutation(char[] arr,int k){
        if (k == arr.length){
            res.add(new String(arr));
        }
        for (int i = k; i < arr.length; i++) {
            swap(arr,k,i);
            getPermutation(arr,k+1);
            swap(arr,k,i);        //回溯
        }
    }
    static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
