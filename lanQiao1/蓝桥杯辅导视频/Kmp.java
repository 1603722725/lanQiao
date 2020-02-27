package À¶ÇÅ±­¸¨µ¼ÊÓÆµ;
import java.util.Arrays;
/**
 * @author wl
 * @Data 2020-02-14 20:48
 */
public class Kmp {
    public static void main(String[] args) {
        String s = "ghghghg;";
        String p = "ghg";
        int res = indexof(s, p);
        System.out.println(res);
    }
    static int indexof(String s,String p){
        if (s.length()==0 || p.length()==0) return -1;
        if (p.length()>s.length()) return -1;
        int[] next = next(p);
        int i=0,j=0,sLen=s.length(),pLen=p.length(),count=0;
        while (i<sLen){
            if (j==-1 || s.charAt(i)==p.charAt(j)){
                i++;
                j++;
            }else{
                j=next[j];
            }
            if (j==pLen){
                System.out.println("i = "+i);
                count++;
                i--;
                j=next[j-1];
            }
        }
        return count;
    }
    static int[] next(String ps){
        int pLength = ps.length();
        int[] next = new int[pLength];
        char[] p = ps.toCharArray();
        next[0]=-1;
        next[1]=0;
        int j=1;
        int k=next[j];
        while (j<pLength-1){
            if (k<0 || p[j] == p[k]){
                next[++j]=++k;
            }else{
                k=next[k];
            }
        }
        System.out.println(Arrays.toString(next));
        return next;
    }
}
