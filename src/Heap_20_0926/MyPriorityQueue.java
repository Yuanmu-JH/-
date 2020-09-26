package Heap_20_0926;
//大堆
//堆可以实现一个优先级队列;出队列就是堆排序
public class MyPriorityQueue {
    private int[] array = new int[100];
    private int size = 0;

    //入队列的方法，要用到向上调整防止打乱结构
    public void offer(int x){
        array[size] = x;
        size++;
        //把新加的元素向上调整向上调整
        shiftUp(array,size-1);
    }

    //向上调整
    private void shiftUp(int[] array, int index) {
        int child = index;
        int parent = (child -1) / 2;
        //队首元素下标为0
        while (child > 0){
            //当child大于parent，不符合大堆要求，则进行交换
            if(array[child] > array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            }else {
                //父节点比子节点大符合要求
                break;
            }
            child = parent;
            parent = (child - 1) / 2 ;
        }
    }

    //出队列：将最后一个元素直接放在队首的位置，size--删除最后一个元素，在进行上下调整;返回值为队首元素
    public int poll(){
        int oldTop = array[0];
        //将最后一个元素放到队首
        array[0] = array[size -1];
        //删除最后一个元素
        size--;
        //从0 号元素开始调整
        shiftDown(array,size,0);
        return oldTop;
    }

    //大堆实现向下调整（堆顶元素最大）
    public static void shiftDown(int[] array,int size,int index){
        int parent = index;
        int child = 2 * parent +1;  //左子树
        //这个来判断当前的parent有没有子节点,因为是完全二叉树所以只需要判断有没有左子树即可
        while(child < size) {
            //找到左右子树中较大的一个
            if (child + 1 < size && array[child+1] > array[child]) {
                child = child + 1;
            }
            //再拿子节点与parent进行比较
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            } else {
                //当前这个位置开始已经符合大堆的要求了
                break;
            }
            //继续判断后面的
            parent = child + 1;
            child = 2 * parent +1;
        }
    }

    //取堆顶元素
    public int peek(){
        return array[0];
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        //入队列
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);
        //队列非空则出队列
        while (!queue.isEmpty()){
            int cur = queue.poll();
            System.out.print(cur);
        }
    }
}
