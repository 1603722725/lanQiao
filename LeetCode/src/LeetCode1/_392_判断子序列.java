package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-27 9:37
 */
public class _392_еп╤овспРап {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc",
                "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0,j = 0;
        while (i < n && j < m){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n;
    }
}
