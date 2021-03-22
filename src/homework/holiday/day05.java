package homework.holiday;

public class day05 {
    public static void main(String[] args) {

    }

    //给定一个整数数组，判断是否存在重复元素。
    //如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        ff:for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    flag = true;
                    break ff;
                }
            }
        }
        return flag;
    }
}
