package gfg;

import java.util.Scanner;

public class Find_Sum_N_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));

    }
    public static int sum(int n){
        //Base Code
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
}
