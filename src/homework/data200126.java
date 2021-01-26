package homework;

import java.util.Arrays;
import java.util.Scanner;

public class data200126 {
    static boolean Paddy;

    public static void main(String[] args) {
//       System.out.println("第六项："+fib(6));
//        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
//        frequency(arr);//输出只出现一次的数字
//        fac(10);
//        fac1(3);
//        func(arr);
//        System.out.println(max3(2,5,6));\
//        System.out.println(max(2,3));
//        System.out.println(max(3.2,2.5));
//        System.out.println(max(2.3,3.2,2));
//        System.out.println(sum(2,4));
//        System.out.println(sum(2.1,4.2,5.0));
//        System.out.println(Paddy);
//        System.out.println(Arrays.toString(transform(arr)));
        int[] arra = {1, 2, 3, 4, 5, 6 ,7, 8};
        int[] arrb = {2, 4, 6, 8, 10, 12, 14, 16};
        swap(arra,arrb);
    }

    //给定两个整型数组, 交换两个数组的内容.
    public static void swap(int[] a,int[] b){
        for(int i=0;i < a.length;i++){
            int temp=a[i];
            a[i]=b[i];
            b[i]=temp;
        }
        System.out.println("a:"+Arrays.toString(a));
        System.out.println("b:"+Arrays.toString(b));
    }

    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    public static int[] transform(int[] a){
        int left=0;
        int right=a.length-1;
        while(left<right){
            //该循环结束，left指向一个奇数
            while(left<right&&a[left]%2==0){
                left++;
            }
            //该循环结束，right指向一个偶数
            while(left<right&&a[right]%2!=0){
                right--;
            }
            /// 交换两个元素的位置
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
        }
        return a;
    }



    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法
    public static int sum(int a1, int a2) {
        return a1+a2;
    }
    public static double sum(double a1, double a2,double a3) {
        return a1+a2+a3;
    }


    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static int max(int a,int b) {
        return a>b ? a:b;
    }
    public static double max(double i,double j) {
        return i>j ? i:j;
    }
    public static double max (double i,double j,int k) {
        return max(max(i,j),k);
    }

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public  static int max2(int a,int b){
        return a > b ? a:b;
    }
    public static int max3(int a ,int b,int c){
     int i = max2(a,b);
     return max2(i,c);
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
    public static  void func(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[j] % 2 != 0){
                    int tmp= a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    //求N的阶乘
    public static void fac1(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        System.out.println(n+"阶乘为"+num);
    }

    //求阶乘和
    public static void fac(int n){
        int sum = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
            sum += num;
        }
        System.out.println(n+"阶乘和为"+sum);
    }

    //斐波那契数列
    public static int  fib(int n ){
        int a = 1;
        int b = 1;
        int sum = a + b;
        if(n == 0){
            return 0;
        }else if(n == 1 || n ==2) {
            return 1;
        }else if(n >2){
            for(int i = 3;i < n;i++){
                a = b;
                b = sum;
                sum = a+b;
            }
        }
        return sum;
    }

    public static void frequency(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;//判断出现次数
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.printf("只出现一次的数字是%d", a[i]);//只出现一次则输出该数据
            }
        }
    }
}
