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
public class _�������ɾ�Ĳ� {
    public static void main(String[] args) {

    }
    //��ӡ����
    public void print(ListNode node){
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    //���ӽڵ�
    public void addNode(Object data){
        ListNode node = new ListNode(data);

    }
}
