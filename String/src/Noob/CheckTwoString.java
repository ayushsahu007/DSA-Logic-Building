package Noob;

import java.util.Scanner;

public class CheckTwoString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1:");
        String s1 = sc.nextLine();

        char[] ch1 = s1.toCharArray();

        System.out.println("Enter String 2:");
        String s2 = sc.nextLine();

        char[] ch2 = s2.toCharArray();

        if (ch1.length != ch2.length) {
            System.out.println("Not Same");
            sc.close();
            return;
        }

        boolean flag = true;

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        sc.close();
    }
}