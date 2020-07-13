package

���ű�������Ƶ;
import java.util.LinkedList;

/**
 * @author wl
 * @Data 2020-04-17 17:50
 */
public class dfs���ֺ� {
static int kk=0;
public static void main(String[]args){
        int[]arr={1,2,4,7};
        dfs(arr,13,0,new LinkedList<>());
        }
public static void dfs(int[]arr,int k,int cur,LinkedList<Integer> ints){
        if(k==0){
        for(int i=0;i<ints.size();i++){
        System.out.print(ints.get(i)+(i==ints.size()-1?"":"+"));
        }
        System.exit(0);
        }
        if(k<0||arr.length==cur)return;
        dfs(arr,k,cur+1,ints);//��Ҫ���Ԫ��
        ints.add(arr[cur]);
        int index=ints.size()-1;
        dfs(arr,k-arr[cur],cur+1,ints);
        ints.remove(index); //����
        }
        }
