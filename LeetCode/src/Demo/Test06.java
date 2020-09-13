package Demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-08-09 17:04
 */
public class Test06 {
    public static void main(String[] args) {
//        String s = "141425";
//        String[] ss = s.split(",");
//        System.out.println(Arrays.toString(ss));
        long a = 0;
        long b = 4;
        double f = (double) a/b;
        String str = formatDouble(f);
        System.out.println(str);
     }
    public static String formatDouble(double d) {
        BigDecimal bg = new BigDecimal(d).setScale(2, RoundingMode.UP);
        double num = bg.doubleValue();
        if (Math.round(num) - num == 0) {
            return String.valueOf((long) num);
        }
        return String.valueOf(num);
    }
}
