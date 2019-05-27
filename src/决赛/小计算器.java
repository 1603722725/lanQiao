package 决赛;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * @author 汪磊
 * @date 2019/5/3 - 16:41
 * 100分
 * 此处输入必须用BufferedReader，如果用Scanner用例过不完
 * 自行百度BufferedReader和scanner的区别
 */
public class 小计算器 {
    static String op = "";             //运算符
    static int hex = 10;               //进制数
    static long num [] =new long[2];
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            String []str  = bufferedReader.readLine().split(" ");
            operate(str);
        }
    }

//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void operate(String str []){
        switch (str[0]){
            case "NUM":
                if(op.equals("")){
                    num[0] = Long.valueOf(str[1],hex);
                   // System.out.println(num[0]);
                }else{
                    num[1] = Long.valueOf(str[1],hex);
                    num[0] = calculator();
                    op="";
                }
                break;
            case "ADD":
                op = "ADD";
                break;
            case "SUB":
                op= "SUB";
                break;
            case "MUL":
                op="MUL";
                break;
            case "DIV":
                op = "DIV";
                break;
            case "MOD":
                op = "MOD";
                break;
            case "EQUAL":
                print();
                break;
            case "CLEAR":
                num[0]=0;
                num[1]=0;
                op="";
                break;
            case "CHANGE":
                hex = Integer.parseInt(str[1]);
                break;
            default :
                break;
        }
    }

    //输出
    public static void print(){
        System.out.println(Long.toString(num[0],hex).toUpperCase());
    }
    //计算器
    public static Long calculator(){
        long res=0;
        switch (op){
            case "ADD":
                res=num[0]+num[1];
                break;
            case "SUB":
                res = num[0]-num[1];
                break;
            case "MUL":
                res = num[0]*num[1];
                break;
            case "DIV":
                res = num[0]/num[1];
                break;
            case "MOD":
                res = num[0]%num[1];
                break;
            default :
                break;
        }
        return  res;
    }
}
