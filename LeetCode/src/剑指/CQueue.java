package 剑指;

import leetcode.A;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wl
 * @Data 2020-06-30 8:58
 * _99_两个栈实现队列
 */
public class CQueue {
    public static void main(String[] args) {

    }


    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.addLast(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
