package Noob;

import java.util.Scanner;

public class FInd_ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character - ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);
        sc.close();
    }
}
