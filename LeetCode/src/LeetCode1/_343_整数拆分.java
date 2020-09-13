package LeetCode1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-07-30 22:09
 */
public class _343_ÕûÊı²ğ·Ö {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","002");
        map.put("003","004");
        System.out.println(map.keySet());
    }
    public static int integerBreak(int n) {
        if (n == 1 && n == 2) return 1;
        if (n == 3) return 2;
        return 0;
    }
}
