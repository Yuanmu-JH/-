package Heap_20_0926;
/*
    给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
    定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
    找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
    示例 1:
     输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
     输出: [1,2],[1,4],[1,6]
     解释: 返回序列中的前 3 对数：
         [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//定义一个数对的类
class Pair implements Comparable<Pair>{
    public int n1;
    public int n2;
    public int sum;

    public Pair(int n1,int n2){
        this.n1 = n1;
        this.n2 = n2;
        this.sum = n1 + n2;
    }

    @Override
    public int compareTo(Pair o) {
        //当前对象比参数小，返回<0；否则返回>1，一样大返回0
        return this.sum - o.sum;
    }
}

public class HeapExam {
    // 返回值是一个二维数组，其中每一行就是一个数对（两个元素），一共有K行
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        //非法情况
        if(nums1.length == 0 ||nums2.length == 0 || k <= 0){
            return result;
        }
        //创建优先队列
        PriorityQueue<Pair> queue = new PriorityQueue<>();  //默认为小堆
        //获取所有可能的数对并加入到队列中
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                queue.offer(new Pair(nums1[i],nums2[j]));
            }
        }
        //循环结束后，此时所有数对都在队列中，循环取出k个较小的元素即可
        for (int i = 0; i < k && ! queue.isEmpty(); i++) {
            Pair cur = queue.poll();
            List<Integer> tmp = new ArrayList<>();
            tmp.add(cur.n1);
            tmp.add(cur.n2);
            result.add(tmp);
        }
        return result;
    }
}
