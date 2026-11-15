package gfg;

import java.util.Scanner;

public class Find_Power_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(num,pow));

    }
    public static int power(int n,int p){
        if (p==0){
            return 1;
        }
        return n * power(n,p-1);
    }
}
