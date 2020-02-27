package ¿∂«≈±≠∏®µº ”∆µ;

/**
 * @author wl
 * @Data 2020-02-13 21:32
 */
public class RabinKarp {
    static long seed = 31;
    public static void main(String[] args) {
        String m = "asdfghjkl";
        String p = "kl";
        match(m,p);
    }
    static void match(String m,String p){
        long hash_p = hash(p);
        for (int i = 0; i+p.length() <= m.length() ; i++) {
            long hash_m = hash(m.substring(i,i+p.length()));
            if (hash_m==hash_p)
                System.out.println("match:"+i);
        }
    }
    static long hash(String str){
        long h=0;
        for (int i = 0; i != str.length(); i++) {
            h = seed*h + str.charAt(i);
        }
        return h%Long.MAX_VALUE;
    }
}
