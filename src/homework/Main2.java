package homework;

public class Main2 {
    public static void main(String[] args) {
        Node head = createList();
        print(head);
        Node one = head.next;
        insert(head,one,6);
        print(head);
        remove(head,one);
        print(head);
        Node newHead = insert(head,0);
        print(newHead);
        deleteNode(newHead,6);
        print(newHead);

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

    //遍历链表
    public static void print(Node head){
        for(Node cur = head;cur != null ;cur = cur.next){
            System.out.print(cur.val +" ");
        }
        System.out.println();
    }

    //指定位置中间插入
    public static void insert(Node head, Node insert,int val){
        Node newNode = new Node(val);
        Node prev = head;
        while (prev != null && prev.next != null && prev.next != insert){
            prev = prev.next;
        }
        if(prev == null){
            return;
        }
        newNode.next = prev.next;
        prev.next = newNode;
    }

    //插入到链表表头
    public static Node insert(Node head,int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    //按值删除链表一般节点
    public static void deleteNode(Node head,int val){
        Node prev = head;
        while(prev != null && prev.next != null && prev.next.val != val){
            prev = prev.next;
        }
        if(prev == null){
            return;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    //按照位置删除一般节点
    public static  void remove(Node head,Node toDelete){
        Node prev = head;
        while(prev != null  && prev.next != toDelete){
            prev = prev.next;
        }
        if(prev == null){
           return;
        }
        prev.next = toDelete.next;
    }

}
