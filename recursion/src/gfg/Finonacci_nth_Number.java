package gfg;

import java.util.Scanner;

public class Finonacci_nth_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = fibonacci(num);
        System.out.println(f);


    }
    public static int  fibonacci(int n){
        if (n<=1){
        return n;
         }
       return fibonacci(n-1) + fibonacci(n-2);
    }
}
