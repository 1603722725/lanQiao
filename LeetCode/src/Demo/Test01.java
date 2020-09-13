package Demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-07-17 18:09
 */
public class Test01 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("1",1230);
        map.put("2","sdsd00");
        map.put("3",3.2);
        System.out.println(Collections.singleton(map));
        System.out.println(map);
    }
}
