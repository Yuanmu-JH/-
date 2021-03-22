package homework.holiday;

public class day04 {
    public static void main(String[] args) {

    }

    //给你一个字符串 s，由若干单词组成，单词之间用空格隔开。
    // 返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }

    //给你两个有序整数数组 nums1 和 nums2，
    // 请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m - 1, j = n - 1;
        while(i >= 0 && j >= 0){
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }

}
