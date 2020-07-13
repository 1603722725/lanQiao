package ���ű�������Ƶ;
/**
 * @author ����
 * @date 2019/4/26 - 17:34
 */
public class ������ {
//������� ������
public static void preOrder(int arr[],int index){
        if(index>=arr.length)
        return;
        System.out.print(arr[index]+" "); //���ڵ�
        preOrder(arr,2*index+1);    //������
        preOrder(arr,2*index+2);    //������
        }
//������� �����
public static void inOrder(int arr[],int index){
        if(index>=arr.length)
        return;
        inOrder(arr,2*index+1);
        System.out.print(arr[index]+" ");
        inOrder(arr,2*index+2);
        }
//������� ���Ҹ�
public static void postOrder(int arr[],int index){
        if(index>=arr.length)
        return;
        postOrder(arr,2*index+1);
        postOrder(arr,2*index+2);
        System.out.print(arr[index]+" ");
        }
public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        preOrder(arr,0);
        System.out.println();
        inOrder(arr,0);
        System.out.println();
        postOrder(arr,0);
        }
        }
