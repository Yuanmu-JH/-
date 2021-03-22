package homework.holiday;

import java.util.ArrayList;
import java.util.List;

public class day13 {

    //你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
    //解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length ; i++)
        {
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> newtemp = new ArrayList<Integer>(res.get(j));
                newtemp.add(nums[i]);
                res.add(newtemp);
            }
        }
        return res;
    }

    //

}
