package ����;

/**
 * @author ����
 * @date 2019/4/30 - 21:37
 */
public class ƽ��ʮλ��{
static boolean Judge(long num){              //�жϴ�ƽ�����Ƿ����0~9
        int arr[]={0,0,0,0,0,0,0,0,0,0};
        int tt=0;
        while(num!=0){
        int d=(int)(num%10);    //��Ÿ�λ��
        if(arr[d]==1){
        return false;
        }
        arr[d]=1;
        tt++;
        num=num/10;
        }
        if(tt==10){     //ƽ������30000��ʼ��ƽ������û��10λ�������ж�
        return true;
        }
        return false;
        }
public static void main(String args[]){
        long i=0;
        long max=0;
        for(i=30000;i<100000;i++){
        if(Judge(i*i)==true){
        if(i*i>max){
        max=i*i;
        }
        }
        }
        System.out.println(max);
        }

        }