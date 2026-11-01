package Noob;

import java.util.Scanner;

public class Remove_Brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0;i<ch.length;i++ ){
            if (ch[i] == '(' || ch[i] == ')' || ch[i] == '[' || ch[i] == ']' || ch[i] == '{' || ch[i]  == '}') {
                continue;
            }
            System.out.print(ch[i]);
        }
    }
}
