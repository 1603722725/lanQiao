package string;

public class zfc02 {
    final static long seed = 31;

    public static void main(String[] args) {
        //System.out.println(Long.MAX_VALUE);
        String str1 = "aababcabcacb";
        String str2 = "abc";
        match(str1, str2);
    }

    //�ַ���ƥ��   ����
    public static void match(String p, String t) {
        for (int i = 0; i < p.length() - t.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == p.charAt(j + i) && j == t.length() - 1) {
                    System.out.println(i);
                } else if (t.charAt(j) != p.charAt(j + i)) {
                    break;
                }
            }
        }
    }

    // �ù���hash,RabinKarp�㷨
    static long hash(String str) {
        long h = 0;
        for (int i = 0; i < str.length(); i++) {
            h = h * seed + str.charAt(i);
        }
        return h % Long.MAX_VALUE;
    }
}
