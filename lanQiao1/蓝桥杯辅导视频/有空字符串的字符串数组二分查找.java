package

���ű�������Ƶ;

import java.util.Arrays;

/**
 * @author ����
 * @date 2019/4/26 - 15:12
 */
public class �п��ַ������ַ���������ֲ��� {
public static int indexOf(String arr[],String p){
        int begin=0;
        int end=arr.length-1;
        while(begin<=end){
        int indexOfMid=begin+((end-begin)>>1);
        while(arr[indexOfMid].equals("")){
        indexOfMid++;
        if(indexOfMid>end)
        return-1;
        }
        if(arr[indexOfMid].compareTo(p)>0)
        end=indexOfMid-1;
        else if(arr[indexOfMid].compareTo(p)<0)
        begin=indexOfMid+1;
        else return indexOfMid;
        }
        return-1;
        }
public static void main(String[]args){
        String arr[]={"d","s","","f","","dsfgfc"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index=indexOf(arr,"f");
        System.out.println(index);
        }
        }
