package 蓝桥杯;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class map遍历 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "ling");
		map.put(1, "yi");
		map.put(2, "er");
		map.put(3, "san");
		map.put(4, "si");
		map.put(5, "wu");
		map.put(6, "liu");
		map.put(7, "qi");
		map.put(8, "ba");
		map.put(9, "jiu");
		map.put(10, "fu");
		//方法一
		for(Integer key:map.keySet()){
			String value = map.get(key);
			//System.out.println(key+"  "+value);
		}
		
		//方法二
		Iterator<Integer> iter =  map.keySet().iterator();
		while(iter.hasNext()){
			Integer key = iter.next();
			String value = map.get(key);
			//System.out.println(key+"  "+value);
		}
		//方法三
		for(Entry<Integer, String> eo:map.entrySet()){
			eo.getKey();
			eo.getValue();
			//System.out.println(eo.getKey()+" = "+eo.getValue());
		}
		//方法四
		Iterator<Entry<Integer, String>> iter1 =  map.entrySet().iterator();
		while(iter1.hasNext()){
			Entry<Integer, String> entry = iter1.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" gh "+value);
		}
	}
}
