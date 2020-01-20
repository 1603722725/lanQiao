package 决赛;

/**
 * @Author: wl
 * @Date: 2019/5/23 23:25
 */
public class 国王的遗产 {
    public static void main(String[] args) {
        double aa = 0;
        for (int i = 4; i < 10; i++) {
            aa+=1.0/i;
        }
        double sum = 11/(1-aa);
        System.out.println(sum);
    }
}
