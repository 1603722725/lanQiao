package LeetCode1;

import org.w3c.dom.ls.LSInput;
import sun.font.FontRunIterator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wl
 * @Data 2020-06-26 19:50
 * 1, 2, 3, 3, 2, 1
 */
public class _ÒÆ³ýÖØ¸´½Úµã {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        ListNode ll = listNode;
        ll = listNode.next;
        ll.next = new ListNode(3);
//        listNode = listNode.next;
//        listNode.next = new ListNode(4);
//        listNode = listNode.next;
//        listNode.next = new ListNode(5);
//        listNode = listNode.next;
//        listNode.next = new ListNode(6);
        ListNode l = removeDuplicateNodes(listNode);
        while (l.next != null) {
            System.out.println(l.val);
            l = l.next;
        }

    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) return head;
        Set<Integer> list = new HashSet<>();
        list.add(head.val);
        ListNode pos = head;
        while (pos.next != null) {
            ListNode cur = pos.next;
            if (list.add(cur.val)) {
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
