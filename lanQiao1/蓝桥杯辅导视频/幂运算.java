package À¶ÇÅ±­¸¨µ¼ÊÓÆµ;

/**
 * @author wl
 * @Data 2020-03-11 12:59
 */
public class ÃİÔËËã {
    public static void main(String[] args){
        System.out.println(ex1(2,4));
        System.out.println(5>>1);
    }
    static long ex1(long m,long n){
        long p = m;
        long res = 1;
        while (n!=0){
            if ((n&1)==1)
                res*=p;
            p=p*p;
            n>>=1;
        }
        return res;
    }
}
