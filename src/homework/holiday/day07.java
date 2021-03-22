package homework.holiday;

public class day07 {

    //给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            while (left < right && (A[left] & 1) == 0) {
                left++;
            }
            while (right > left && (A[right] & 1) != 0) {
                right--;
            }
            int temp = A[right];
            A[right] = A[left];
            A[left] = temp;
            left++;
            right--;
        }
        return A;
    }

    //给你一个整数数组 nums，请编写一个能够返回数组 “中心下标” 的方法。
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int cur = 0;
        for(int i = 0; i < nums.length; ++i){
            cur += nums[i];
            if(2 * cur - nums[i] == sum) {
                return i;
            }
        }
        return -1;
    }


}
