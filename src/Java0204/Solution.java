package Java0204;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Solution {
    public ListNode removeElements(ListNode head, int val){
        if(head == null){
            return null;
        }
        //删除一般节点
        //待删除节点的前一个结点
        ListNode prev = head;
        ListNode cur = head.next;   //待删除节点
        while (cur != null){
            if(cur.val == val){
                //找到删除节点并且删除
                prev.next= cur.next;
                cur = prev.next;
            }else {
                //为找到，继续找
                prev = prev.next;
                cur =   cur.next;
            }
        }
        //删除的元素是头节点
        if(head.val == val){
            head = head.next;
        }

        return head;
    }

    //链表逆置
    public ListNode reverseList(ListNode head){
        //空链表情况
        if (head == null){
            return null;
        }
        //只有一个节点
        if (head.next == null){
            return head;
        }
        //处理一般情况
        ListNode newHead = null;
        ListNode prevNode = null;
        ListNode curNode = head;
        ListNode nextNode = curNode.next;
        while (curNode != null){
            //进入循环时需要先设定好nextNode的位置
            nextNode = curNode.next;
            if(nextNode == null){
                //curNode指向了链表的最后一个节点
                //此刻curNode所处的是新链表的头节点
                newHead = curNode;
            }
            //改变指向方向
            curNode.next = prevNode;
            //更新引用位置
            prevNode = curNode;
            curNode = nextNode;
        }
        return newHead;
    }

    public static void main(String[] args) {
        //构造链表
        ListNode head = new ListNode(1);
        Solution solution = new Solution();
        ListNode result  = solution.removeElements(head,1);

    }
}
