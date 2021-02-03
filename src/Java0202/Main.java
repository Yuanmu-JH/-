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

    //创建带傀儡节点的链表
    //傀儡节点中的值是不使用的
    public static  Node createListWithDummy(){
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        dummy.next = a;
        a.next = b;
        b.next = c;
        c.next = null;
        return a;
    }

    public static void main(String[] args) {
        Node head = createList();



//        //创建带傀儡节点的链表
//        Node head = createListWithDummy();
//        Node newNode = new Node(100);
//
//        //尾插一个节点
//        Node prev = head;
//        if(head == null){
//            return;
//        }
//        //先找到末尾节点
//        while(prev.next != null){
//             prev = prev.next
//        }
//        //循环结束找到末尾节点
//        newNode.next = prev.next;
//        prev.next = newNode;

//        //往中间位置插入（1和2之间）
//        //prev是指向1的，表示插入的前一个元素
//        Node prev = head.next;
//        newNode.next = prev.next;
//        prev.next = newNode;

//        //插入到头部(有傀儡节点，所以是插入到head 的后面)
//        Node prev = head;
//        newNode.next = prev.next;
//        prev.next = newNode;





//        //把节点插入之间位置（到2和3之间）
//        Node one = head;
//        //创建新节点
//        Node newNode = new Node(100);
//        //先把新节点的next指向3这个节点
//        newNode.next = one.next.next;
//        //把2的next指向新节点
//        one.next.next = newNode;

//        //插入到链表头部
//        Node newNode = new Node(100);
//        //新节点指向head
//        newNode.next = head;
//        //head指向新节点
//        head = newNode;

//        //循环遍历链表（不带傀儡节点）
//       for(Node cur = head; cur != null ; cur = cur.next){
//           System.out.print(cur.val + " ");
//       }
//
////        Node cur = head;
////        //循环遍历链表.找到最后一个节点
////       while (cur != null && cur.next != null){
////           cur = cur.next;
////       }
////       //循环结束则指向最后一个节点
////        System.out.println(cur.val);
////
////        //循环遍历链表.找到倒数第二个节点
////        while(cur != null && cur.next != null && cur.next.next != null){
////            cur = cur.next;
////        }
////        System.out.println(cur.val);
//        //取链表正数第N个元素
////        int N = 3;
////        Node cur = head;
////        for (int i =1 ;i <N; i++){
////            cur = cur.next;
////        }
//        //获取链表长度
//        int count = 0 ;
//        for(Node cur = head; cur != null;cur = cur.next){
//            count++;
//        }
//    //遍历链表，查找链表上是否存在某个元素
//        int toFind = 3;
//        Node cur= head;
//        for(;cur != null ;cur = cur.next){
//            if(cur.val == toFind){
//                break;
//            }
//        }
//        if (cur != null) {
//            System.out.println("找到了");
//        }else {
//            System.out.println("没找到");
//        }

    }

    //根据给定值删除节点
    public static void remove(Node head, int val){
        //先找到toDelete值对应的位置以及他的前驱节点
        Node prev = head;
        while(prev != null && prev.next != null && prev.next.val != val){
            prev = prev.next;
        }
        //循环结束后，prev就指向待删除节点的前一个节点
        if(prev == null || prev.next== null){
            //没有找到
            return;
        }
        //删除
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    //按照位置删除节点
    public static void remove(Node head, Node toDelete){
        Node prev = head;
        while(prev != null && prev.next != toDelete){
            prev = prev.next;;
        }
        if(prev == null){
            return;
        }
        //进行删除
        prev.next = toDelete.next;
    }

    //O(1)
    public static void remove2(Node head, Node toDelete){
        Node nextNode = toDelete.next;
        toDelete.val = nextNode.val;
        toDelete.next = nextNode.next;
    }

    public  static int size(Node head){
        int count = 0;
        for (Node cur = head;cur != null; cur = cur.next){
            count++;
        }
        return count;
    }

    //按照给定节点下标来进行删除
    public static void remove3(Node head, int index){
        if(index < 0 || index >= size(head)){
            return;
        }
        //删除头节点
        if(index == 0){
        //TODO
        }
        //找到链表待删除节点的前一个位置
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        //循环结束，进行删除
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    }
