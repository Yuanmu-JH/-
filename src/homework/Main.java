package homework;

public class Main {
    public static void main(String[] args) {
        Node head = createList();
        printList(head);
        getLast(head);
        getLast2(head);
        getNumN(head,2);
        getLength(head);
        FindEle(head,2);
        FindEle(head,6);

    }

    //初始化链表
    public static Node createList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b ;
        b.next = c ;
        c.next = d;
        d.next = null;
        return a;
    }

    //打印链表的每个元素
    public static void printList(Node head){
        for(Node cur = head; cur!= null;cur = cur.next){
            System.out.print(cur.val+" ");
        }
        System.out.println();
    }

    //得到链表的最后一个节点
    public static void getLast(Node head){
        Node cur = head;
        while(cur != null && cur.next!= null){
            cur = cur.next;
        }
        System.out.println("最后一个节点是:"+ cur.val);
    }

    //找到倒数第二个节点
    public static void getLast2(Node head){
        Node cur = head;
        while(cur != null && cur.next != null && cur.next.next != null){
            cur = cur.next;
        }
        System.out.println("倒数第二个节点为："+cur.val);
    }

    //找到链表的第N个节点
    public static void getNumN(Node head , int N){
        Node cur = head;
        for (int i = 1; i < N; i++) {
            cur = cur.next;
        }
        System.out.println("第"+ N+"个节点为："+cur.val);
    }

    //计算链表中的元素个数
    public static void getLength(Node head){
        int count = 0;
        for(Node cur = head;cur != null;cur = cur.next){
            count++;
        }
        System.out.println("链表中的元素个数为："+count);
    }

    //找到链表中是否含有某元素
    public static void FindEle(Node head, int toFind){
        Node cur = head;
        for(; cur != null;cur = cur.next){
            if(cur.val == toFind){
                break;
            }
        }
        if(cur != null){
            System.out.println("链表中包含元素"+ toFind);
        }else {
            System.out.println("链表中未包含元素"+toFind);
        }
    }
}
