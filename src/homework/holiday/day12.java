package homework.holiday;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class day12 {

    //给你一个整数数组 nums ，你需要找出一个 连续子数组 ，
    // 如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
    public int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(nums);
        int start = 0, end = 0,i = 0;
        for (; i < nums.length; i++) {
            if(arr[i] != nums[i]) {
                start = i;
                break;
            }
        }
        if(i >= nums.length){
            return 0;
        }
        for (i = nums.length - 1; i >= 0; i--) {
            if(arr[i] != nums[i]) {
                end = i;
                break;
            }
        }
        return (end - start + 1);
    }

    //根据 逆波兰表示法，求表达式的值
    //有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String t : tokens) {
            switch (t){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int num = stack.pop();
                    stack.push(stack.pop() - num);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int num2 = stack.pop();
                    stack.push(stack.pop() / num2);
                    break;
                default:
                    stack.push(Integer.valueOf(t));
            }
        }
        return stack.pop();
    }

}
