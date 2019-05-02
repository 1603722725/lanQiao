package 栈和队列;

import java.util.Stack;

/**
 * @author 汪磊
 * @date 2019/4/17 - 21:20
 * 仅用递归函数和栈操作逆序一个栈
 */
public class problem03_ReverseStack {
    //取栈底元素并移除
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return  last;
        }
    }
    public static void reverse(Stack<Integer>stack){
        if (stack.isEmpty())
            return;
        int i=getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
    public static void main(String[] args) {
        Stack<Integer> test = new Stack<Integer>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        reverse(test);
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
    }
}
