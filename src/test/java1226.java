package test;

import java.util.Scanner;

public class java1226 {
    public static void main(String[] args) {
//        ShuiXianHua(0,999);  //水仙花数
//        login();    //模拟用户登录
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        MeiYiWei(n);
    }

    public static void login() {
        String password = "12211";

        Scanner scanner = new Scanner(System.in);
        int i = 0 ;
        for (; i < 3; i++) {
            System.out.println("输入您的密码：");
            String input = scanner.next();
            if (input.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登陆失败");
            }
        }
        if (i == 3) {
            System.out.println("三次输入错误，账号封锁");
        }
    }

    public static void ShuiXianHua(int begin,int end){
        for (int i = begin ;i <= end ;i++){
            if(isShuiXian(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isShuiXian(int i) {
        //将i中的十进制的位取出来
        int ge = i % 10; //取出个位
        int tmp = i/10;
        int shi = tmp %10;
        tmp = i/100;
        int bai = tmp % 10;
        if(cube(ge )+cube(bai)+cube(shi) == i){
            return true;
        }
        return false;
    }

    //立方
    public static int cube(int n){
        return n*n*n;
    }

    //输出整数的每一位
    public static void MeiYiWei(int n){

        if(n > 9 ) {
            MeiYiWei(n / 10);
        }
        System.out.print(n % 10+" ");
    }

}



