package 剑指;
/**
 * @author wl
 * @Data 2020-07-25 0:18
 */
public class _16_数值的整数次方 {
    public static void main(String[] args) {
        double res = myPow(2,-2);
        System.out.println(res);
    }
        public static double myPow(double x, int n) {
            if(x == 0) return 0;
            long b = n;
            if (b<0){
                x = 1/x;
                b=-b;
            }
            double res = 1.0;
            while (b>0){
                if ((b&1) == 1) res *=x;
                x = x*x;
                b >>= 1;
            }
            return res;
        }


}
