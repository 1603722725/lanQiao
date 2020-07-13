package

��̬�滮;
import java.util.HashSet;
import java.util.Set;

public class dynamic02 {
    //�Ϸ�����
    public static void main(String[] args) {
        Set<String> p1 = p(4);
        System.out.println(p1);
    }

    //������ʽ
    public static Set<String> p(int n) {
        Set<String> res = new HashSet<>();
        res.add("()");
        if (n == 1) return res;
        for (int i = 2; i <= n; i++) {
            Set<String> res1 = new HashSet<>();
            for (String e : res) {
                res1.add(e + "()");
                res1.add("(" + e + ")");
                res1.add("()" + e);
            }
            res = res1;
        }
        return res;
    }

}
