package 吴师兄;

/**
 * @author wl
 * @Data 2020-06-29 18:13
 */
public class _反转链表 {
    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 3;
        head.next.next.next = new Node();
        head.next.next.next.data = 4;
        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 5;
        recursiveReverse(head);
    }

    /**
     * 递归，在反转当前节点之前先反转后续节点
     */
    public static Node recursiveReverse(Node currentNode) {
        if (currentNode == null || currentNode.getNext() == null) {
            return currentNode;
        }

        Node returnNode = recursiveReverse(currentNode.getNext());
        //这里是重点。
        //当前节点（currentNode）的下一个节点，正好是返回节点returnNode的最后一个节点
        currentNode.getNext().setNext(currentNode);
        currentNode.setNext(null);
        return returnNode;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node() {
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
