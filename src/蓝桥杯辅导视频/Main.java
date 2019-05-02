package À¶ÇÅ±­¸¨µ¼ÊÓÆµ;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ÍôÀÚ
 * @date 2019/4/24 - 21:32
 */
public class Main{
    static Stack<Integer> stack = new Stack<>();
    public static void f(int n){
        while(n>0){
            int t = n%26;
            n=n/26;
            if(t==0){
                stack.push(26);
                break;
            }
            else
                stack.push(t);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            f(n);
            for (int i = stack.size() - 1; i >= 0; i--) {
                char c = (char) (64 + stack.pop());
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
