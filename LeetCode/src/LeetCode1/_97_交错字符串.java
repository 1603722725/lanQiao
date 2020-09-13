package LeetCode1;

import javax.swing.text.StyledEditorKit;

/**
 * @author wl
 * @Data 2020-07-18 8:42
 */
public class _97_交错字符串 {
    public static void main(String[] args) {
//        String  s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
        String s1 =  "aabc",
        s2 = "abad",
        s3 = "aabcabad";
        boolean res = isInterleave(s1,s2,s3);
        System.out.println(res);
    }
    //错误解法 （自己写的）
    public static boolean isInterleave01(String s1, String s2, String s3) {
        if (s1.length()+s2.length()<s3.length())
            return false;
        int i = 0,j = 0,k = 0;
//        int min = Math.min(s1.length(),s2.length());
        if (s3.substring(0,s1.length()) == s1 && s3.substring(s1.length())==s2)
            return true;
        if (s3.substring(0,s2.length()) == s2 && s3.substring(s2.length())==s1)
            return true;
        while (i < s1.length() && j < s2.length()){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            char c3 = s3.charAt(k);
            if (c3 == c2){
                j++;
                k++;
            }else if (c3 == c1){
                i++;
                k++;
            }else {
                return false;
            }
        }
        String res = "";

        if (i == s1.length()){
            res = s2.substring(j);
//            int x= i+j;
            s3 = s3.substring(i+j);
        }else {
            res = s1.substring(i);
//            int x= i+j;
           s3 = s3.substring(i+j);
        }
        if (res.equals(s3))
            return true;
        return false;
    }
    //DP
    public static boolean isInterleave1(String s1, String s2, String s3){
        int m = s1.length(),n = s2.length(),t = s3.length();
        if (m+n != t)
            return false;
        boolean[][] f = new boolean[m+1][n+1];
        f[0][0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int p = i + j - 1;
                if (i>0){
                    f[i][j] = f[i][j] || (f[i-1][j] && s1.charAt(i-1) == s3.charAt(p));
                }
                if (j>0){
                    f[i][j] = f[i][j] || (f[i][j-1] && s2.charAt(j-1) == s3.charAt(p));
                }
            }
        }
        return f[m][n];
    }
    // 滚动数组
    public static boolean isInterleave(String s1, String s2, String s3){
        int m = s1.length(),n = s2.length(),t = s3.length();
        if (m+n != t)
            return false;
        boolean [] f = new boolean[n+1];
        f[0] = true;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int p = i + j -1;
                if (i > 0){
                    f[j] = f[j] && s1.charAt(i-1) == s3.charAt(p);
                }
                if (j > 0){
                    f[j] = f[j] || (f[j-1] && s2.charAt(j-1) == s3.charAt(p));
                }
            }
        }
        return f[n];
    }
}
