package 栈和队列;

import java.util.Stack;

/**
 * @author 汪磊
 * @date 2019/4/19 - 19:08
 */
public class problem04_栈的排序 {
    public static void sortStackByStack(Stack<Integer>stack){
        Stack<Integer> help = new Stack<Integer>();
        while(!stack.isEmpty()){
            int cur = stack.pop();
            while (!help.isEmpty()  &&  help.peek()>cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(8);
        stack.push(6);
        stack.push(7);
        stack.push(3);
        stack.push(4);
        sortStackByStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
