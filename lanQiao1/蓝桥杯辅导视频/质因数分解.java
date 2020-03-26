package 蓝桥杯辅导视频;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-03-11 8:04
 */
public class 质因数分解 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = primeFactory(13);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            int k = entry.getKey();
            int v=entry.getValue();
            for (int i = 0; i < v; i++) {
                sb.append("*"+k);
            }
        }
        System.out.println(map);
       // System.out.println(sb.substring(1));
    }

    /**
     * 质因数分解
     * @param num
     * @return
     */
    static Map<Integer,Integer> primeFactory(int num){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 2; i*i <= num; i++) {
            while (num%i==0){
                Integer v = map.get(i);
                if (v == null)
                    map.put(i,1);
                else
                    map.put(i,v+1);
                num/=i;
            }
        }
        return map;
    }
}
