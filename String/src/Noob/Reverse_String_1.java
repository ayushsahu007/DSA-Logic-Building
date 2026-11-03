package Noob;

import java.util.Scanner;

public class Reverse_String_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String - ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String s = "";

        for (int i = ch.length-1;i>=0;i--){
            s = s+ch[i];
        }

        System.out.println(s);

    }
}
