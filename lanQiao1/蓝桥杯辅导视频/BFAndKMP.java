package ���ű�������Ƶ;

/**
 * @author ����
 * @date 2019/4/23 - 13:44
 * �ַ���ƥ�䣬�Բ�����Ⱦ���Ϊ��
 */
public class BFAndKMP {
    public static int BF(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == len2)
            return i - j;
        else return -1;
    }

    //KMP       ��next����   KMPƥ��
    public static int[] getNext(String str) {
        char p[] = str.toCharArray();
        int len = str.length();
        int next[] = new int[len];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < len - 1) {
            //p[k]��ʾǰ׺��p[j]��ʾ��׺
            if (k == -1 || p[j] == p[k]) {
                ++k;
                ++j;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        int flag = BF("asdfgh", "asdf");
        if (flag >= 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}