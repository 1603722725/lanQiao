package LeetCode1;

import javafx.scene.SnapshotParameters;

/**
 * @author wl
 * @Data 2020-06-27 9:19
 */
public class _ÅÐ¶ÏÁ½×Ö·û´®ÏàµÈ {
    public static void main(String[] args) {
        String s1 = "123456";
        String s2 = "123456";
        boolean res = isEqual(s1, s2);
        System.out.println(res);
    }

    public static boolean isEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int ans = 0;
        for (int i = 0; i < s1.length(); i++) {
            ans |= s1.charAt(i) ^ s2.charAt(i);
        }
        return ans == 0;
    }
}
