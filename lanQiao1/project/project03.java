package project;

import java.util.HashMap;
import java.util.Map;

public class project03 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = prime(100);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            for (int i = 0; i < v; i++) {
                sb.append("*" + k);
            }
        }
        System.out.println(sb);
    }

    public static Map<Integer, Integer> prime(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                Integer v = map.get(i);
                if (v == null)
                    map.put(i, 1);
                else
                    map.put(i, v + 1);
            }
            num /= i;
        }
        return map;
    }
}

