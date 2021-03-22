package homework.holiday;

import java.util.HashMap;

public class day09 {

    //给定一个整数数组 nums 和一个整数目标值 target，
    // 请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    //给你两个二进制字符串，返回它们的和（用二进制表示）。
    //输入为 非空 字符串且只包含数字 1 和 0。
    public String addBinary(String a, String b) {
        if(a == null || a.length() == 0) {
            return b;
        }
        if(b == null || b.length() == 0){
            return a;
        }

        StringBuilder stb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;

        int c = 0;  // 进位
        while(i >= 0 || j >= 0) {
            if(i >= 0){
                c += a.charAt(i --) - '0';
            }
            if(j >= 0){
                c += b.charAt(j --) - '0';
            }
            stb.append(c % 2);
            c >>= 1;
        }

        String res = stb.reverse().toString();
        return c > 0 ? '1' + res : res;
    }


}
