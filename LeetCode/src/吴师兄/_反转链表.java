package ��ʦ��;

/**
 * @author wl
 * @Data 2020-06-29 18:13
 */
public class _��ת���� {
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
     * �ݹ飬�ڷ�ת��ǰ�ڵ�֮ǰ�ȷ�ת�����ڵ�
     */
    public static Node recursiveReverse(Node currentNode) {
        if (currentNode == null || currentNode.getNext() == null) {
            return currentNode;
        }

        Node returnNode = recursiveReverse(currentNode.getNext());
        //�������ص㡣
        //��ǰ�ڵ㣨currentNode������һ���ڵ㣬�����Ƿ��ؽڵ�returnNode�����һ���ڵ�
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
