package test;

import java.util.Scanner;

public class java1215 {
    public static void main(String[] args) {
//    Num9();
//        isYear();
//        System.out.println(isSuShu(9));
//        isAge(18);
    PrintXin();
    }

    public static void PrintXin(){
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==n-i-1||j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static void isAge(int age){
        if(age <=18){
            System.out.println(age+"岁是少年");
        }else if (age >18 && age<= 28){
            System.out.println(age+"岁是青年");
        }else if (age >29 && age <=55){
            System.out.println(age+"岁是中年");
        }else{
            System.out.println(age+"岁是老年");
        }

    }

    public static Boolean isSuShu(int num){
        int i ;
        for (i = 2;i < num;i++){
                if(num % i == 0) {
                    return false;
                }
            }
        return true;
    }

    public static void isSuShu(){
        int i ;
        int num ;
        for ( num = 1; num <= 100 ; num++) {
            for ( i = 2;i<num;i++){
                if(num % i == 0) {
                   break;
                }
            }
            if(num==i){
                System.out.print(num+ " ");
            }
        }
    }
    
    public static void Num9(){
        int n = 0;
        for(int i = 0;i<100;i++){
            if(i%10 == 9){
                n++;
            }
            if (i/10 == 9) {
                n++;
            }
        }
        System.out.println("100中有"+n+"个9");
    }

   public static void isYear() {
        for (int year = 1000;year<2000;year++)
        {
            if(year % 4 ==0 && year%100 !=0 || year%400==0){
                System.out.print(year+" ");
            }
        }
   }
}
