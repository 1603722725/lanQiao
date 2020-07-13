package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ForkJoinPool;

/**
 * @author wl
 * @Data 2020-03-25 11:29
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.forEach(System.out::println);
        System.out.println("=============================");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);
        hashMap.forEach((k, v) -> System.out.println(k + "_" + v.intValue()));
    }
}
