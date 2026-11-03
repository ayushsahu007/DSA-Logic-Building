package Noob;

import java.util.Scanner;

public class Reverse_String_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String - ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0;i < ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1] = temp;
        }
        System.out.print(ch);

    }
}
