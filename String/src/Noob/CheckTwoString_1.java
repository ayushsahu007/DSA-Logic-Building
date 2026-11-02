package Noob;

import java.util.Scanner;

public class CheckTwoString_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();

        System.out.println("Enter String 2");
        String str2 = sc.nextLine();

        if (str1.hashCode() == str2.hashCode()){
            System.out.println("Both String are Same");
        }else {
            System.out.println("Both String are not Same");
        }
        sc.close();
    }
}