import java.util.Scanner;
// 输入一个字符串，输出他的集合
public class test0131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            char [] arr = scanner.next().toCharArray();
            String string = "";
            for (int i = 0; i < arr.length; i++) {
                String tmp = "";
                tmp += arr[i];
                while (!(string.contains(tmp))){
                    string += tmp;
                }
            }
            System.out.println(string);
        }
    }
}
