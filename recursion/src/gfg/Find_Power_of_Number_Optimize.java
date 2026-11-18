package gfg;

import java.util.Scanner;

public class Find_Power_of_Number_Optimize {
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
        int call = power(n,p/2);

        if (p%2==0)
            return call * call;
        else
            return n * call * call;


//        if (n%2==0)  // 2 ^ 4 = 16 // 2 * 2 * 2 * 2 = 16
//          return power(n,p/2) * power(n,p/2);
//        else  // 2 ^ 5 = 32  // 2 * 2 * 2 * 2 * 2 = 32
//            return n * power(n,p/2) * power(n,p/2);
    }
}







