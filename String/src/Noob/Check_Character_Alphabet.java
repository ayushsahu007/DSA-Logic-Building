package Noob;

import java.util.Scanner;

public class Check_Character_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >='a' && ch<= 'z'){
            System.out.println(ch + " is Alphabet");
        }else {
            System.out.println(ch + " is not Alphabet");
        }
    }
}
