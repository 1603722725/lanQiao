package ��ָ;

/**
 * @author wl
 * @Data 2020-07-25 0:04
 */
public class _15_��������1�ĸ��� {
    public static void main(String[] args) {

    }
    public static int hammingWeight1(int n) {
        int ans = 0;
        String res = Integer.toBinaryString(n);
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '1')
                ans++;
        }
        return ans;
    }
    public static int hammingWeight(int n){
        int ans = 0;
        while (n != 0){
            ans += n&1;
            n = n>>>1;
        }
        return ans;
    }
}
