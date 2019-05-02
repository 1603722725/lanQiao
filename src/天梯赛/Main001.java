package 天梯赛;
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
		int length=x.length;
		while (length != 1) {
			int k = 0;
			for (int i = 0; i < length; i++) {//i从0开始i为偶数时原序列为奇数
				if (i % 2 != 0)//原序列为偶数
					x[k++] = x[i];//将序列中的数移到最前面
				else length--;
			}
		}
 
		System.out.println(x[0]);
	}
}