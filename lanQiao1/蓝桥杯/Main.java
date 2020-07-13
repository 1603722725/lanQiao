package

���ű�;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.valueOf(str, 16);//���������ת��Ϊ10����

        if (str.length() == 1)
            System.out.println("Hex: 0x00" + str);
        else if (str.length() == 2)
            System.out.println("Hex: 0x0" + str);
        else
            System.out.println("Hex: 0x" + str);
        System.out.println("Decimal: " + n);
        String e = Integer.toOctalString(n);
        if (e.length() == 1)
            System.out.println("Octal: 000" + e);
        else if (e.length() == 2)
            System.out.println("Octal: 00" + e);
        else if (e.length() == 3)
            System.out.println("Octal: 0" + e);
        if (e.length() == 4)
            System.out.println("Octal: " + e);
    }
}
