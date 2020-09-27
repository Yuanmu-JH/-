package Heap_20_0926;

import java.util.PriorityQueue;

//使用标准库中的优先队列
public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);
        while (!queue.isEmpty()){
            int cur = queue.poll();
            System.out.println(cur);
        }
    }
}
