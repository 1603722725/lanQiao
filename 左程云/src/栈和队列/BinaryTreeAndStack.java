package 栈和队列;
import java.util.HashMap;
import java.util.*;

/**
 * @author wl
 * @Data 2020-08-13 9:47
 */
public class BinaryTreeAndStack {
    static class Node{
        int value;
        Node left;
        Node right;
        public Node(int data){
            this.value = data;
        }
    }
    public static void main(String[] args){
        int[] arr = {12,5,1,2,8,6,4,45};
        Node node = getMaxTree(arr);
        System.out.println(node.toString());
    }
    public static Node getMaxTree(int[] arr){
        Node[] nArr = new Node[arr.length];
        for (int i = 0; i < arr.length; i++){
            nArr[i] = new Node(arr[i]);
        }
        Stack<Node> stack = new Stack<>();
        HashMap<Node,Node> lBigMap = new HashMap<>();
        HashMap<Node,Node> rBigMap = new HashMap<>();
        for (int i = 0; i < nArr.length; i++){ //左
            Node curNode = nArr[i];
            while (!stack.isEmpty() && stack.peek().value < curNode.value){
                popStackSetMap(stack,lBigMap);
            }
            stack.push(curNode);
        }
        while(!stack.isEmpty()){
            popStackSetMap(stack,lBigMap);
        }
        for (int i = nArr.length - 1; i >= 0; i--) {
            Node curNode = nArr[i];
            while (!stack.isEmpty() && stack.peek().value < curNode.value){
                popStackSetMap(stack,rBigMap);
            }
            stack.push(curNode);
        }
        while (!stack.isEmpty()){
            popStackSetMap(stack,rBigMap);
        }
        Node head = null;
        for (int i = 0; i < nArr.length; i++){
            Node curNode = nArr[i];
            Node left = lBigMap.get(curNode);
            Node right = rBigMap.get(curNode);
            if (left == null && right == null){
                head = curNode;
            }else if (left == null){
                if (right.left == null){
                    right.left = curNode;
                }else{
                    right.right = curNode;
                }
            }else if (right == null){
                if (left.left == null){
                    left.left = curNode;
                }else {
                    left.right = curNode;
                }
            }else {
                Node parent = left.value < right.value ? left : right;
                if (parent.left == null){
                    parent.left = curNode;
                }else {
                    parent.right = curNode;
                }
            }
        }
        return head;
    }

    public static void popStackSetMap(Stack<Node> stack, HashMap<Node,Node> map){
        Node popNode = stack.pop();
        if (stack.isEmpty()){
            map.put(popNode,null);
        }else {
            map.put(popNode,stack.peek());
        }
    }

}
