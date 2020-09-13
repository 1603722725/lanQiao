package Demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author wl
 * @Data 2020-08-13 20:24
 */
public class Test08{
    public static void main(String[] args) {
        List<Map<String,Object>> list = new ArrayList<>();
        String id = "GXA110";
        if(id!=null && id!=""){
            list = list.stream()
                .filter((e) -> e.get("id").toString().matches("(.*)" + id + "(.*)"))
                .collect(Collectors.toList());
        }

            list.stream()
                .filter((e) -> e.get("id").toString().matches("(.*)" + id + "(.*)"))
                .forEach(System.out::println);

            list.stream()
                    .filter((e) -> e.get("id").toString().matches("(.*)" + id + "(.*)"))
                    .findFirst();

//        list.stream().map(list::get/).collect(Collectors.toList());
        //抽取对象中所有 id 的集合
//        employees.stream().map(Employee::getId).collect(Collectors.toList());
        list.stream().filter((e)->e.get("id").toString().matches("aa")).collect(Collectors.toList());
    }
}
