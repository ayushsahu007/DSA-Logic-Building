package gfg;

import java.util.Scanner;

public class Print_Incre_Decres{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fun(num);

    }
    static void fun(int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
}
