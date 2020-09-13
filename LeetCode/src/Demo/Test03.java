package Demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wl
 * @Data 2020-08-05 9:34
 */
public class Test03 {
        /**
         *  处理时间
         * @param oldTime  原时间
         * @param add  增加时间
         */
        public static String  TimeAdd(String oldTime,String add){
            int addMit = Integer.valueOf(add);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = df.parse(oldTime);
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("时间格式化异常！");
            }
            Date expireTime = new Date(date.getTime() + addMit*60*1000);
            String newTime = df.format(expireTime);
            return newTime;
        }

        public static void main(String[] args) throws ParseException {
            String timeAdd = TimeAdd("2020-07-31 23:00:51", "31");
            System.out.println(timeAdd);
        }
}
