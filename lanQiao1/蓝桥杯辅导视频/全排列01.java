package 蓝桥杯辅导视频;

import java.util.ArrayList;

/**
 * @author wl
 * @Data 2020-04-17 11:10
 * 字符串全排列
 */
public class 全排列01 {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(getPermutation(str).size());
    }
    public static ArrayList<String> getPermutation(String A){
        int n = A.length();
        ArrayList<String> res = new ArrayList<>();
        res.add(A.charAt(0)+"");
        for (int i = 1; i < n; i++) {
            ArrayList<String> res_new = new ArrayList<>();
            char c = A.charAt(i);
            for (String str:res) {
                res_new.add(str+c);
                res_new.add(c+str);
                for (int j = 1; j < str.length(); j++) {
                    res_new.add(str.substring(0,j)+c+str.substring(j));
                }
            }
            res = res_new;
        }
        return res;
    }
}
