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
    //    Node head = createList();

        //创建带傀儡节点的链表
        Node head = createListWithDummy();
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

    //返回的链表是不带傀儡节点的链表
    public static Node arrayToLinkedList(int[] array){
        //遍历数组，把元素依次进行尾插即可
        //每次找为节点太麻烦，所以使用引用将尾节点记住
        //初始情况下，头节点和尾节点都为null
        Node head = null;
        Node tail = null;
        for (int x : array) {
            Node node = new Node(x);
            //将node进行尾插，需要判断当前链表是否为空
            if(head == null){
                head = node;
                tail = node;
            }else {
                //链表不为空，再进行新的插入时，就不必管head，直接操作tail即可
                tail.next = node;
                //一旦插入完成，新节点就变为tail，需要更新tail的指向
                tail = tail.next;
            }
        }
        return head;
    }

    public static Node arratToLinkedList2(int [] array){
        //创建一个带傀儡节点的链表，就不需要分两种情况了
        //head指向的是傀儡节点
        Node head = new Node(0);
        Node tail = null;
        for (int x :array) {
            Node node = new Node(x);
            tail.next = node;
            tail = tail.next;
        }
        return head.next;
    }

    //不带傀儡节点进行尾删
    public static Node removeTail(Node head){
        if(head == null){
            return null;
        }
        if(head .next == null){
            //链表只有一个节点， 尾删的节点就是这个head本身，此时删除这个节点就变成空链表
            return null;
        }
        //一般情况
        Node prev = head;
        Node toDelete = prev.next;
//        while(prev != null && prev.next != null && prev.next.next!= null){
//            prev = prev.next;
//        }
        while (prev != null && prev.next != null){
            toDelete = prev.next;
            if(toDelete.next == null){
                break;
            }
            prev = prev.next;
        }
//        prev.next == null;
        prev.next = toDelete.next;
        return head;
    }

    //带傀儡节点进行删除操作
    public static void deleteWithDummy(Node head,int val){
        Node prev = head ;
        while(prev != null &&prev.next != null && prev.next.val != val){
            prev = prev .next;
        }
        //未找到对应节点
        if(prev == null || prev.next == null){
            return;
        }
        //找到了
        Node toDelete = prev.next;
        prev.next = toDelete.next;
        return;
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
