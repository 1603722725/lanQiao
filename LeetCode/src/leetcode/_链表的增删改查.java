package leetcode;

/**
 * @author wl
 * @Data 2020-07-15 22:37
 */
class ListNode{
    Object data;
    ListNode next;
    ListNode(Object x){
        data = x;
    }
}
public class _链表的增删改查 {
    public static void main(String[] args) {

    }
    //打印链表
    public void print(ListNode node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    //增加节点
    public void addNode(Object data){
        ListNode node = new ListNode(data);

    }
}
