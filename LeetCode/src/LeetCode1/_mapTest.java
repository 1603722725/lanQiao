package LeetCode1;

import com.sun.javafx.collections.MappingChange;

import java.rmi.MarshalledObject;
import java.util.*;
import java.util.zip.DeflaterOutputStream;

/**
 * @author wl
 * @Data 2020-07-02 16:33
 */
public class _mapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "11");
        map.put("1", "111");
        map.put("2", "22");
//        System.out.println(map.containsKey("11"));
//        System.out.println(map.toString());
//        Set<String> set = map.keySet();
//        System.out.println(set.toString());
        List<String> list = new ArrayList<>(map.values());
        Collection<String> c = map.values();
        System.out.println(c.toString());
    }
}
