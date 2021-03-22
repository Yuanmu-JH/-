package homework.holiday;

public class day10 {

    //请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数


    //给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
    //如果数组中不存在目标值 target，返回 [-1, -1]。
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1, -1};
        res[0] = binarySearch(nums, target, true);
        res[1] = binarySearch(nums, target, false);
        return res;
    }

    public int binarySearch(int[] nums, int target, boolean leftOrRight) {
        int res = -1;
        int left = 0, right = nums.length - 1, mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(target < nums[mid]){
                right = mid - 1;
            }
            else if(target > nums[mid]) {
                left = mid + 1;
            }
            else {
                res = mid;
                if(leftOrRight) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return res;
    }

}
