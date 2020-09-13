package 剑指;

/**
 * @author wl
 * @Data 2020-08-08 16:50
 */
public class _18_删除链表的节点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {

    }
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode temp = head;
        if (head.val == val)
            return head.next;
        while (null != head.next){
            if (head.next != null && head.next.val == val){
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
        return temp;
    }
}
