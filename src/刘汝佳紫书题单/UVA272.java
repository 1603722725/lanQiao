package ÁõÈê¼Ñ×ÏÊéÌâµ¥;
import java.util.Scanner;
/**
 * @author ÍôÀÚ
 * @date 4/9/2019 - 8:25 AM
 */
public class UVA272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char c[] = str.toCharArray();
            boolean flag = false;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '"') {
                    System.out.print(flag?"``":"''");
                    flag = !flag;
                } else {
                    System.out.print(c[i]);
                }
            }
            System.out.println();
        }
    }
}