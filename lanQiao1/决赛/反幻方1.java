package ����;

/**
 * @Author: wl
 * @Date: 2019/5/21 8:47
 * ��  3120
 */
public class ���÷�1{
static int[]arr={1,2,3,4,5,6,7,8,9}; // ö������
static int[]vis=new int[arr.length]; //�������
static int[]m=new int[arr.length]; //������� ����
static int count=0;

public static void main(String[]args){
        dfs(0);
        //��8��ӦΪ����ת4��+����2��
        System.out.println(count/8);
        }

public static void dfs(int k){
        if(k==arr.length){
        //�����Ǽ���Ƿ�ÿ��λ�ö������
        boolean flag=true;
        int row1=m[0]+m[1]+m[2];
        int row2=m[3]+m[4]+m[5];
        int row3=m[6]+m[7]+m[8];
        int col1=m[0]+m[3]+m[6];
        int col2=m[1]+m[4]+m[7];
        int col3=m[2]+m[5]+m[8];
        int xie1=m[0]+m[4]+m[8];
        int xie2=m[2]+m[4]+m[6];
        int[]p={row1,row2,row3,col1,col2,col3,xie1,xie2};
        for(int i=0;i<p.length;++i)   //ʱ�临�Ӷ�̫��   �Ż�   ��set����
        for(int j=i+1;j<p.length;++j){
        if(p[i]==p[j]){
        flag=false;
        break;
        }
        if(!flag)
        break;
        }
        if(flag)
        count++;
        return;
        }
        //��������̽-���ݵĹ��̣�ȫ����
        for(int i=0;i< 9;++i){
        if(vis[i]==0){
        vis[i]=1;
        m[k]=arr[i];
        dfs(k+1);
        vis[i]=0;
        }
        }
        }
        }
