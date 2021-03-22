package homework.holiday;

import java.util.Arrays;

public class day06 {
    public static void main(String[] args) {

    }

    //给你一个按 非递减顺序 排序的整数数组 nums，返回
    // 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序
    public int[] sortedSquares(int[] nums) {
        int[] nums2=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            nums2[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums2);
        return nums2;
    }

    // 给定一个字符串 S，返回 “反转后的” 字符串，
    // 其中不是字母的字符都保留在原地，而所有字母的位置发生反转
    public String reverseOnlyLetters(String S) {
        if (S == null || S.length() == 0) {
            return S;
        }

        int l = 0, r = S.length() - 1;
        char[] chars = S.toCharArray();
        while (l < r) {
            while (l < r && !Character.isLetter(chars[l])) {
                l++;
            }
            while (l < r && !Character.isLetter(chars[r])) {
                r--;
            }
            if (l < r) {
                char tmp = chars[l];
                chars[l] = chars[r];
                chars[r] = tmp;
            }
            l++;
            r--;
        }
        return String.valueOf(chars);
    }


}
