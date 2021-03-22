package homework.holiday;

import java.util.PriorityQueue;

public class day08 {

    //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

    //给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。

    public int thirdMax(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int num:nums){
            if(!queue.contains(num)){
                queue.add(num);
            }
        }
        int[] ret=new int[queue.size()];
        for(int i=0,length=ret.length;i<length;i++){
            ret[i]=queue.poll();
        }
        return ret.length>=3?ret[ret.length-3]:ret[ret.length-1];
    }

}


