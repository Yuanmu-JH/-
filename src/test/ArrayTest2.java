package test;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
//        int[] arr = {2,4,3,6,7,8,5,1,9};
        int [ ] arr = {2,4,6,11,23,45,55,67};
//        int pos = search(arr,5);//循环查找
//        int pos = binarySearch(arr,45);//二分查找
//        System.out.println(pos);
//        System.out.println(isSorted(arr));//检查有序
//        bubblSort(arr); //数组有序化,冒泡排序
//        Arrays.sort(arr);   //标准库中的快速排序
//        reverse(arr);   //数组逆序
//        transform(arr);
//        System.out.println(Arrays.toString(arr));
//        int newarr[] = copyOf(arr);
//        System.out.println(Arrays.toString(newarr));
        System.out.println(toString(arr));
    }

    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] arr){
        String ret="[";
        int i;
        for(i=0;i<arr.length;i++){
            if(i<arr.length-1){
                ret+=arr[i]+", ";
            }else if(i==arr.length-1){
                ret+=arr[i]+"]";
            }
        }
        return ret;
    }

    //数组拷贝
    public static int[] copyOf(int []arr) {
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            //先从左往右找到一个奇数
            while(left < right && arr[left] % 2 == 0){
                left++;
            }

            //在从右往左找偶数
            while(left < right && arr[right] % 2 != 0){
                right--;
            }
            //交换
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] =tmp;
        }
    }

    //偶数在前 奇数在后

    //数组逆序
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left ++;
            right --;
        }
    }

    //冒泡排序
    //外层控制遍历次数
    //已排序区间：[0,bound)
    //待排序区间：[bound,length]
    public static void bubblSort(int[] arr) {
        for(int bound = 0; bound < arr.length;bound++){
            //里层循环控制比较交换
            for (int cur = arr.length - 1; cur > bound; cur--) {
                //升序
                if(arr[cur - 1] > arr[cur]){
                    //不符合升序
                    int tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }

            }
        }
    }

    //判断数组是否有序。
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //二分查找是在有序数组中查找，和带查找元素比较，每次砍掉一半的多余项
    public static int binarySearch(int[] arr,int toSearch){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
//            int mid = (left + right) / 2;
        int mid = left + (right - left) / 2;
            if(toSearch < arr[mid]){
                right = mid - 1;
            }else if(toSearch > arr[mid]){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //遍历访问找目标元素
    public static int search(int[] arr,int toSearch){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == toSearch){
                return i;
            }
        }
        return -1;
    }
}
