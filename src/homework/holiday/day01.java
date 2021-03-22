package homework.holiday;

public class day01 {
    public static void main(String[] args) {


    }

    //实现函数 ToLowerCase()
    // 该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
    public String toLowerCase(String str) {
        if (str == null && "".equals(str)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k%length;
        if(k == 0 || length < 2){
            return;
        }
        for(int i = 0 ; i < k ; i++){
            int t1 = nums[0];
            for(int j = 1 ; j < length ; j++){
                int t2 = nums[j];
                nums[j] = t1;
                t1 = t2;
            }
            nums[0] = t1;
        }
        return;
    }
}

