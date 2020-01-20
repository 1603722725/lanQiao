package 决赛;

/**
 * @author 汪磊
 * @date 2019/5/6 - 13:27
 * 全排列
 */
public class 反幻方 {
    static int a[] = {1,2,3,4,5,6,7,8,9};
    static int ans = 0;
    public static void main(String[] args) {
        f1(0);
        System.out.println(ans);
        System.out.println(ans/8);
    }
    private static void f1(int k){
       if (k == a.length)
           if (check(a))
               ans++;
        for (int i = k; i <a.length; i++) {
            {int t=a[i];a[i]=a[k];a[k]=t;}
            f1(k+1);
            {int t=a[i];a[i]=a[k];a[k]=t;}
        }
    }

    private static boolean check(int f[]){
            int sum1=f[0]+f[1]+f[2];
            int sum2=f[3]+f[4]+f[5];
            int sum3=f[6]+f[7]+f[8];
            int sum4=f[0]+f[3]+f[6];
            int sum5=f[1]+f[4]+f[7];
            int sum6=f[2]+f[5]+f[8];
            int sum7=f[0]+f[4]+f[8];
            int sum8=f[2]+f[4]+f[6];
            if(sum1!=sum2&&sum1!=sum3&&sum1!=sum4&&sum1!=sum5&&sum1!=sum6&&sum1!=sum7&&sum1!=sum8)
                if(sum2!=sum3&&sum2!=sum4&&sum2!=sum5&&sum2!=sum6&&sum2!=sum7&&sum2!=sum8)
                    if(sum3!=sum4&&sum3!=sum5&&sum3!=sum6&&sum3!=sum7&&sum3!=sum8)
                        if(sum4!=sum5&&sum4!=sum6&&sum4!=sum7&&sum4!=sum8)
                            if(sum5!=sum6&&sum5!=sum7&&sum5!=sum8)
                                if(sum6!=sum7&&sum6!=sum8)
                                    if(sum7!=sum8)
                                       return true;
                                    return false;
        }
}
