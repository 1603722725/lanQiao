package 决赛;
import java.util.*;
/**
 * @Author: wl
 * @Date: 2019/5/15 22:37
 * 839542176
 */
public class 最大乘积1{
    public static boolean [] fal = new boolean [10];
    public static int a,b,c;
    public static int [] a1 = new int [10];
    public static int max = 0;
    public static void main(String[] args){
        dfs(1);
        System.out.println(max);
    }
    //	1-9全排列
    private static void dfs(int temp){
        if(temp>9){
            for(int i=1;i<=4;i++){
                jike(i);
            }
            return;
        }
        for(int i=1;i<=9;i++){
            if(!fal[i]){
                fal[i] = true;
                a1[temp] = i;
                dfs(temp+1);
                fal[i] = false;
            }
        }
    }
    /**
     *      号在哪个位置
     */
    public static void jike(int h){
        int sum2 = 0;
        int sum3 = 0;
        for(int i=1;i<=h;i++){
            sum2 = sum2*10+a1[i];
        }
        for(int i=h+1;i<=9;i++){
            sum3 = sum3*10+a1[i];
        }
        if(show(sum2,sum3)){

        }
    }
    //	判断是否符合
    public static boolean show(int i,int j){
        int sum = i*j;
        int sum1 = sum;
        Set<String> set = new HashSet<String>();
        while(sum>0){
            if(sum%10==0){
                return false;
            }
            set.add(sum%10+"");
            sum = sum/10;
        }
        if(set.size()!=9){
            return false;
        }else{
            max = max>sum1?max:sum1;
            return true;
        }
    }
}
//839542176