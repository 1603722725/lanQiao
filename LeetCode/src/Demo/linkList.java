package Demo;
/**
 * @author wl
 * @Data 2020-07-17 21:39
 */
public class linkList {
    //����һ���ڵ���,�洢���ݺ�����
    class Node{
        private int data;
        private Node next = null;
        public Node(int data) {
            super();
            this.data = data;
        }
    }
    Node head=null;    //����ͷ�����ó�ʼ��Ϊ��
    //β��
    public void addNode(int a){
        Node newnode=new Node(a);//ʹ�ô���Ĳ���ʵ����һ���ڵ�
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;		//һ���ƶ���ָ��(��ͷ��㿴��һ��ָ�����ָ��)
        while(temp.next!=null){//����������ֱ�����������һ��������ѭ����
            temp=temp.next;		//������һ����㣬ָ����һ����㡣Ŀ�����ҵ����һ�����
        }
        temp.next=newnode;		//tempΪ���һ����������ͷ��㣬����nextָ���½��
    }
    //��indexλ�ú������λ�ò���ָ��Ԫ�ؽ��
    public void insertnodebyindex(int index,int i){
        //�жϲ���λ�úϷ���(�½���Ͻ�,��λ���Ͻ�)
        if(index<1){
            System.out.println("���Ϸ�");
            return;
        }
        int length=0;//��¼������λ��
        //��������Ҫ����Ԫ�صĽ��
        Node node=new Node(i);
        //�ƶ���ָ��
        Node temp=head;
        while(temp.next!=null){
            //�ӵ�һ��Ԫ�ؿ�ʼ��
            length++;
            if(index==length){
                //1.temp�ĺ�̽��ĳ�Ϊ�²�����ĺ�̽��
                node.next=temp.next;
                //2.�ڰ��²���Ľ����p�ĺ�̽��
                temp.next=node;
                return;
            }
            //û�ҵ�indexʱ���ѭ����������
            temp=temp.next;
        }
    }
    //ɾ��index��һ��λ�õĽ��
    public void deleteNode(int index){
        if(index<1){
            System.out.println("���Ϸ�");
            return;
        }
        Node temp=head;
        int length=0;
        while(temp.next!=null){
            length++;
            if(index==length){
                //��temp�ĺ�̽��ĳ�temp�ĺ�̽��ĺ�̽��
                //����temp��ָ����ָ��temp�ĺ���ĺ����Ԫ��
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    //��ȡ������
    public int size(){
        int length=1;
        Node temp=head;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
    //��ӡ���
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
        //��3��Ԫ�غ������
        list.insertnodebyindex(3 ,9);
        list.printlist();
        System.out.println("\t");
        //ɾ��
        list.deleteNode(3);
        list.printlist();
        System.out.println("\t");
        System.out.println(list.size());
    }
}