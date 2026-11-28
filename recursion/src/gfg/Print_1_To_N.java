package gfg;

import java.util.Scanner;

public class Print_1_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number - ");
        int num = sc.nextInt();
        reverse(num);
    }
    public static void reverse(int n){
        if (n == 0){
            return;
        }
        reverse(n-1);
        System.out.println(n);;

    }
}
