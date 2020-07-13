package

������;
import java.util.*;

public class Main001 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = "abcdefghijklmnopqrs";
        String ss = "";
        for (int i = 1; i <= 106; i++) {
            ss += s;
        }
        char[] x = ss.toCharArray();
        int length = x.length;
        while (length != 1) {
            int k = 0;
            for (int i = 0; i < length; i++) {//i��0��ʼiΪż��ʱԭ����Ϊ����
                if (i % 2 != 0)//ԭ����Ϊż��
                    x[k++] = x[i];//�������е����Ƶ���ǰ��
                else length--;
            }
        }

        System.out.println(x[0]);
    }
}