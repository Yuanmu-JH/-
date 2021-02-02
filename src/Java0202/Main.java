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
        //循环遍历链表
       for(Node cur = head; cur != null ; cur = cur.next){
           System.out.print(cur.val + " ");
       }

//        Node cur = head;
//        //循环遍历链表.找到最后一个节点
//       while (cur != null && cur.next != null){
//           cur = cur.next;
//       }
//       //循环结束则指向最后一个节点
//        System.out.println(cur.val);
//
//        //循环遍历链表.找到倒数第二个节点
//        while(cur != null && cur.next != null && cur.next.next != null){
//            cur = cur.next;
//        }
//        System.out.println(cur.val);
        //取链表正数第N个元素
//        int N = 3;
//        Node cur = head;
//        for (int i =1 ;i <N; i++){
//            cur = cur.next;
//        }
        //获取链表长度
        int count = 0 ;
        for(Node cur = head; cur != null;cur = cur.next){
            count++;
        }
    //遍历链表，查找链表上是否存在某个元素
        int toFind = 3;
        Node cur= head;
        for(;cur != null ;cur = cur.next){
            if(cur.val == toFind){
                break;
            }
        }
        if (cur != null) {
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }
    }
}
