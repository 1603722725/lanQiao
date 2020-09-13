package Demo;

import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

/**
 * @author wl
 * @Data 2020-08-05 10:07
 */
public class Test04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();
        list.add("1");
        list.add("2");
        list.add("3");
        map.put(1,"11");
        map.put(2,"22");
        map.put(3,"33");
        System.out.println(list);
        System.out.println(list.toString());
        System.out.println(map.toString());
    }
}
