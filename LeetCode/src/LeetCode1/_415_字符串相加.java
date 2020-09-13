package LeetCode1;

/**
 * @author wl
 * @Data 2020-08-03 8:52
 */
public class _415_×Ö·û´®Ïà¼Ó {
    public static void main(String[] args) {
        String res = addStrings("12","19");
        System.out.println(res);
    }
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        String result = "";
        int q = 0;
        while (i>=0 && j>=0){
            int res = num1.charAt(i) + num2.charAt(j) + q;
            int p = res%10;
            q = res/10;
            result += '0'+p;
            i--;
            j--;
        }
        StringBuffer sb = new StringBuffer(result);
        return sb.reverse().toString();
    }

        public String addStrings01(String num1, String num2){
            StringBuilder res = new StringBuilder("");
            int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
            while(i >= 0 || j >= 0){
                int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
                int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
                int tmp = n1 + n2 + carry;
                carry = tmp / 10;
                res.append(tmp % 10);
                i--; j--;
            }
            if(carry == 1) res.append(1);
            return res.reverse().toString();
        }
}
