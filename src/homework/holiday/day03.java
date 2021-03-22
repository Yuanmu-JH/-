package homework.holiday;

public class day03 {
    public static void main(String[] args) {


    }

    //给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
    // 判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。
    // 如果可以构成，返回 true ；否则返回 false。
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[123];
        for(int i = 0; i < magazine.length(); i++){
            cnt[magazine.charAt(i)] ++;
        }
        for(int i = 0; i < ransomNote.length(); i ++){
            if( -- cnt[ransomNote.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }

//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
