package leetcode;

/**
 * @author wl
 * @Data 2020-02-26 20:40
 */
public class A {
    public static void main(String[] args) {
        String string = "aa    bb   cc";
        String test = string.replaceAll("\\s{1,}", " ");
        System.out.println(test);
        string = test;
        String[] str = string.split(" ");
        for (String string2 : str) {
            System.out.println(string2);
        }
    }
}
