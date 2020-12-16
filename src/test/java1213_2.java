package test;

import java.util.Scanner;

import static java.lang.Integer.min;

public class java1213_2 {
    public static void main(String[] args) {
//        printMultiplicationTable();
//        System.out.println(calcGCD(100,120));
//        System.out.println(calcSeries(100));
        Num2();
    }

    public static void Num2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++) {
            if(((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static double calcSeries(int bound){
        double result = 0;
        for (int i = 1; i <= bound ; i+=2) {
            result += calcIten(i);
        }
        return result;
    }

    public static double calcIten(int i) {
        return 1.0/i - 1.0/(i+1);
    }

    //最大公约数
    public static int calcGCD(int a, int b){
        int min = min(a,b);
        for (int i = min; i >= 1 ; i--) {
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    public static void printMultiplicationTable(){
        //打印乘法口诀
        for (int row = 0; row <=9; row++) {
            printLine(row);
        }
    }

    public static void printLine(int row) {
        //只打印一行
        //第row行里有row行
        for (int col = 0; col <= row ; col++) {
            System.out.print(col + "*"+row+"="+col*row+" ");
        }
        System.out.println();
    }

}

