package gfg;

import java.util.Scanner;

public class Count_Digit {
  static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
            count(num);

    }
    public static void count(int num) {
        if (num == 0 ) {
            System.out.println(count);
            return;
        }
        count++;
        int res = num/10;
        count(res);
    }
}
