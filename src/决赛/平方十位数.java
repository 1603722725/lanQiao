package 决赛;

/**
 * @author 汪磊
 * @date 2019/4/30 - 21:37
 */
public class 平方十位数 {
    static boolean Judge(long num) {    //判断此平方数是否包含0~9
        int arr[]= {0,0,0,0,0,0,0,0,0,0};
        int tt=0;
        while(num!=0) {
            int d=(int)(num%10);    //存放个位数
            if(arr[d]==1) {
                return false;
            }
            arr[d]=1;
            tt++;
            num=num/10;
        }
        if(tt==10) {    //平方根从30000开始，平方数还没到10位，加以判断；
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        long i=0;
        long max=0;
        for(i=30000;i<100000;i++) {
            if(Judge(i*i) == true) {
                if(i*i>max) {
                    max=i*i;
                }
            }
        }
        System.out.println(max);
    }

}