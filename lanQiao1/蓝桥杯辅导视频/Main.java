package

���ű�������Ƶ;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ����
 * @date 2019/4/24 - 21:32
 */
import java.util.Scanner;

public class Main {
    static int a[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String ss[] = s.split(" ");
        a = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            a[i] = Integer.parseInt(ss[i]);
        }
        for (int i = 0; i < a.length - 1; i++) {
            int org = a[i];//����ѡһ������
            for (int j = a[i] + 1; j < a[i + 1]; j++) {//����С���п����ߵ�·
                a[i] = j;
                if (check()) {
                    System.out.println(org + " " + a[i]);
                    return;
                }
            }
            //����
            a[i] = org;
        }
        System.out.println("-1");
    }

    private static boolean check() {//��鵱ǰ�����Ƿ���Ӯ
        int one[] = new int[32];
        int maxlen = 0;
        for (int i = 0; i < a.length - 1; i += 2) {//������С���з�Ϊһ��
            String temp = Integer.toBinaryString(a[i + 1] - a[i] - 1);
            int len = temp.length();
            if (len > maxlen) maxlen = len;
            for (int j = len - 1; j >= 0; j--) {
                if (temp.charAt(j) == '1') {
                    one[len - j - 1] += 1;
                }
            }
        }
        for (int i = 0; i < maxlen; i++) {
            if (one[i] % 2 != 0) {//�����һ��1�ĸ�����Ϊż�����ұ���
                return false;
            }
        }
        return true;//�����Ҿ�Ӯ
    }
}