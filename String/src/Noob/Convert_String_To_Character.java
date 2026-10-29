package Noob;

import java.util.Scanner;

public class Convert_String_To_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Ayush";
         //Without toCharArray()
        char[] ch = new char[str.length()];

        for (int i = 0;i<ch.length;i++){
            ch[i] = str.charAt(i);
        }
        for (char c : ch){
            System.out.println(c);
        }

    }
}
