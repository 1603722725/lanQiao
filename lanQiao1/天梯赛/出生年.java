package

������;
import java.util.Scanner;

public class ������ {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=2;
        for(int i=1;i< 11;i++){
        sum+=Math.pow(2,i-1);
        }
        System.out.println(sum);
        }
        }
