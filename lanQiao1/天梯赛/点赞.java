package

������;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ���� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        for(int i=0;;i++){
        String str=sc.nextLine();
        list.add(str);
        if(str.equals("."))break;
        }
        if(list.size()>14){
        System.out.println(list.get(1)+" and "+list.get(13)+" are inviting you to dinner...");
        }else if(list.size()>2&&list.size()<=14){
        System.out.println(list.get(1)+" is the only one for you...");
        }else{
        System.out.println("Momo... No one is for you ...");
        }


        }
        }
