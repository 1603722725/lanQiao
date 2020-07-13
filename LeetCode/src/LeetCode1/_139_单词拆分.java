package LeetCode1;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.*;

/**
 * @author wl
 * @Data 2020-06-25 21:05
 */
public class _139_µ¥´Ê²ð·Ö {
    public static void main(String[] args) {

    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
