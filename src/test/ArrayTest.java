package test;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        printArray(arr);
        System.out.println(arrayToString(arr)); 

    }

    //数组遍历
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
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
