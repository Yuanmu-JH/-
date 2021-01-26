package test;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

//        System.out.println(arrayToString(arr));
//        System.out.println(sum(arr));
//        System.out.println(Arrays.toString(arr));
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[100];
        setNumber(arr1);
        printArray(arr1);
    }

    public static int[] setNumber(int[] a) {
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
    // 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void transform(int []a ){
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2;
        }
    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    public static int sum(int[] a ){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static double avg(int []a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / (a.length+1);
    }

    //数组遍历
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //数组转为字符串
    public static String arrayToString(int[] arr){
        String result = "[";
        for (int x : arr) {
           result+=x+",";
        }
        result+="]";
        return result;
    }
}
