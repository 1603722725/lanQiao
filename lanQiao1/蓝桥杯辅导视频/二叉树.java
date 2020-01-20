package 蓝桥杯辅导视频;
/**
 * @author 汪磊
 * @date 2019/4/26 - 17:34
 */
public class 二叉树 {
    //先序遍历 根左右
    public static void preOrder(int arr[],int index){
        if(index>=arr.length)
            return;
        System.out.print(arr[index]+" "); //根节点
        preOrder(arr,2*index+1);    //左子树
        preOrder(arr,2*index+2);    //右子树
    }
    //中序遍历 左根右
    public static void inOrder(int arr[],int index){
        if(index>=arr.length)
            return;
        inOrder(arr,2*index+1);
        System.out.print(arr[index]+" ");
        inOrder(arr,2*index+2);
    }
    //后序遍历 左右根
    public static void postOrder(int arr[],int index){
        if(index>=arr.length)
            return;
        postOrder(arr,2*index+1);
        postOrder(arr,2*index+2);
        System.out.print(arr[index]+" ");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        preOrder(arr,0);
        System.out.println();
        inOrder(arr,0);
        System.out.println();
        postOrder(arr,0);
    }
}
