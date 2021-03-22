package homework.holiday;

public class day11 {

    //给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }

    //给定一组字符，使用原地算法将其压缩。
    //压缩后的长度必须始终小于或等于原数组长度。
    public int compress(char[] chars) {
        int n = chars.length;
        char c = chars[0];
        int clength = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        for(int i=1; i<n; i++) {
            if(chars[i] == c) {
                clength++;
            }else {
                if(clength != 1) {
                    sb.append(clength);
                }
                c = chars[i];
                sb.append(c);
                clength = 1;
            }
        }
        if(clength != 1) {
            sb.append(clength);
        }
        char[] newchars = sb.toString().toCharArray();
        for(int i=0; i<newchars.length; i++) {
            chars[i] = newchars[i];
        }
        return newchars.length;
    }

}
