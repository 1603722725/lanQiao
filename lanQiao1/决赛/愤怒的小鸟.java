package ����;
/**
 * @author ����
 * @date 2019/5/6 - 11:20
 */
public class ��ŭ��С�� {
static int count;
static void ff(double k){
        while(k>1){
        count++;
        k=k*2/3;
        }
        }
public static void main(String[]args){
        ff(1000);
        if(count%2==0){
        System.out.println(count/2);
        }
        else{
        System.out.println(count/2+1);
        }
        }
        }
