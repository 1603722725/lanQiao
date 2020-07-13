package 剑指;

import java.util.LinkedList;

/**
 * @author wl
 * @Data 2020-06-30 8:58
 * _99_两个栈实现队列
 */
public class CQueue {
    public static void main(String[] args) {

    }

    LinkedList<Integer> A, B;

    public CQueue() {
        A = new LinkedList();
        B = new LinkedList();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if (!B.isEmpty()) {
            return B.removeLast();
        }
        if (A.isEmpty()) return -1;
        while (!A.isEmpty()) {
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}
