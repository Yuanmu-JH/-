package Heap_20_0926;

import java.util.Arrays;
/*
    堆：完全二叉树；
        通过数组方式顺序存储；
        对于任意节点而言，满足根节点的值大于左右子树的值（大堆）反之则为小堆；
        堆常用来找最值
    ①向下调整、建堆
 */
public class Heap {

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

    public static void createHeap(int[] array,int size){
        //基于向下调整建堆，就要从后往前遍历数组
        //总最后一个节点，size-1找到最后一个叶子节点，再-1除以2找到其父节点
        for(int i = (size -1-1) / 2; i >= 0;i--){
            shiftDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,5,2,7,3,6,9};
        createHeap(array,array.length);
        System.out.println(Arrays.toString(array));

    }

}
