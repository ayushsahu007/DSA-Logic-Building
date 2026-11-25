package gfg;

import java.util.Scanner;

public class GCD_of_2_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number 1 -- ");
        int num1= sc.nextByte();
        System.out.println("Enter a Number 2 -- ");
        int num2= sc.nextByte();

        int gcd = gcd(num1,num2);
        System.out.println(gcd);

    }
    public static int gcd(int n1,int n2){
        if (n1==0){
            return n2;
        }
        return gcd(n2%n1,n1);

    }
}
