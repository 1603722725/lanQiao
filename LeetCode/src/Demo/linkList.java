package Demo;
/**
 * @author wl
 * @Data 2020-07-17 21:39
 */
public class linkList {
    //定义一个节点类,存储数据和引用
    class Node{
        private int data;
        private Node next = null;
        public Node(int data) {
            super();
            this.data = data;
        }
    }
    Node head=null;    //链表头的引用初始化为空
    //尾插
    public void addNode(int a){
        Node newnode=new Node(a);//使用传入的参数实例化一个节点
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;		//一个移动的指针(把头结点看做一个指向结点的指针)
        while(temp.next!=null){//遍历单链表，直到遍历到最后一个则跳出循环。
            temp=temp.next;		//往后移一个结点，指向下一个结点。目的是找到最后一个结点
        }
        temp.next=newnode;		//temp为最后一个结点或者是头结点，将其next指向新结点
    }
    //在index位置后面插入位置插入指定元素结点
    public void insertnodebyindex(int index,int i){
        //判断插入位置合法性(下界和上界,如何获得上界)
        if(index<1){
            System.out.println("不合法");
            return;
        }
        int length=0;//记录遍历的位置
        //创建包含要插入元素的结点
        Node node=new Node(i);
        //移动的指针
        Node temp=head;
        while(temp.next!=null){
            //从第一个元素开始找
            length++;
            if(index==length){
                //1.temp的后继结点改成为新插入结点的后继结点
                node.next=temp.next;
                //2.在把新插入的结点变成p的后继结点
                temp.next=node;
                return;
            }
            //没找到index时向后循环遍历链表
            temp=temp.next;
        }
    }
    //删除index后一个位置的结点
    public void deleteNode(int index){
        if(index<1){
            System.out.println("不合法");
            return;
        }
        Node temp=head;
        int length=0;
        while(temp.next!=null){
            length++;
            if(index==length){
                //把temp的后继结点改成temp的后继结点的后继结点
                //即让temp的指针域指向temp的后面的后面的元素
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    //获取链表长度
    public int size(){
        int length=1;
        Node temp=head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
    //打印结点
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        linkList list=new linkList();
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(8);
        list.addNode(0);
        list.addNode(6);
        list.printlist();
        System.out.println("\t");
        //Node insertnode=new Node(0);
        //在3号元素后面插入
        list.insertnodebyindex(3 ,9);
        list.printlist();
        System.out.println("\t");
        //删除
        list.deleteNode(3);
        list.printlist();
        System.out.println("\t");
        System.out.println(list.size());
    }
}