package Java0202;

public class Main {

    //手动创建链表，使用头节点来指代整个链表，最后将头节点返回
    public  static Node createList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        c.next = null;
        return a;   //返回a中存的地址
    }

    public static void main(String[] args) {
        Node head = createList();
        System.out.println(head.toString());
    }
}
