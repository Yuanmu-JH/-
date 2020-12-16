package test;

import java.util.Random;
import java.util.Scanner;

public class java1213 {
    public static void main(String[] args) {
//        猜数字游戏
//        先生成一个【1，100】的随机整数
        Random random = new Random();
        //[0，99]+1=>[1,100]
        int toGuess = random.nextInt(100)+1;
        //通过循环的提示用户输入数字
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入要猜的数字：");
            int num =  scanner.nextInt();
//            根据用户的输入进行判断
            if(num < toGuess){
                System.out.println("小了");
            }else if(num > toGuess){
                System.out.println("高了");
            }else {
                System.out.println("猜对了");
            }
        }

    }
}
