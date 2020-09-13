package 动态规划;

import java.net.SocketTimeoutException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wl
 * @Data 2020-07-29 9:07
 */
public class LCP_13_寻宝 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse("2018-03-21 14:00:00");
        Date date = format.parse("2018-03-22 16:11:11");
        long between = date.getTime() - parse.getTime();
        long day = between / (24 * 60 * 60 * 1000);
        long hour = (between / (60 * 60 * 1000) - day * 24);
        long min = ((between / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long result = day*24*60 + hour*60 + min;
        System.out.println(day + "天" + hour + "小时" + min + "分" );
        System.out.println(result);

    }
    public static int minimalSteps(String[] maze) {
        return 0;
    }
}
