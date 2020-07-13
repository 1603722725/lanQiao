package

��������;
import java.util.Scanner;

public class �ֿ��� {
static boolean[][]know;//�Ƿ���Ϥ
static int[][]examRoom;//��������
static int res=101,n;
public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        n=cin.nextInt();
        know=new boolean[n+1][n+1];
        examRoom=new int[n][n+1];
        int m=cin.nextInt();
        for(int i=0;i<m;i++){
        int a=cin.nextInt();
        int b=cin.nextInt();
        know[a][b]=know[b][a]=true;
        }
        dfs(1,0);
        System.out.println(res);
        cin.close();
        }
static void dfs(int examineeId,int examRoomAmo){
        //�������������ڻ���ڳ��ֹ�����С�Ŀ������������ˣ���ŪҲ����
        if(examRoomAmo>=res)return;
        //�����ǵĿ�����Ŵ��ڿ�������,���п��������ź���
        if(examineeId>n){
        res=Math.min(res,examRoomAmo);//��ʱ���¼��С�Ŀ�������
        return;
        }

        A:for(int i=0;i<examRoomAmo;i++){    //�����Ѿ����ٵ�ÿ������
        int examineeAmo=examRoom[i][n];//��ǰ���������һλ��ŵ�ǰ�����Ŀ�������
        int j;
        for(j=0;j<examineeAmo;j++){    //������ǰ������ÿ���������ж��Ƿ���ʶ
        if(know[examRoom[i][j]][examineeId]){//�������������ʶ
        continue A;        //������һ������
        }
        }
        if(j==examineeAmo){
        //��ǰ�����Ŀ��������ǵĿ���������ʶ�������ǵĿ������뵱ǰ����
        examRoom[i][examRoom[i][n]++]=examineeId;
        //dfs�ж���һ�����������ĸ�����
        dfs(examineeId+1,examRoomAmo);
        //����������һ����dfs��������Ӱ��
        examRoom[i][n]--;
        }
        }
        //ǰ��ÿ����������ʶ���½�����
        //�����ǵĿ��������¿����ĵ�һ��λ�ã��¿�����������+1
        examRoom[examRoomAmo][examRoom[examRoomAmo][n]++]=examineeId;
        dfs(examineeId+1,examRoomAmo+1);//dfs��һ������
        --examRoom[examRoomAmo][n];//����Ӱ��
        }
        }