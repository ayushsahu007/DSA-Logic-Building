package Noob;

import java.util.Scanner;

public class Convert_Upper_Lower_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String upperCase = "";
        String lowerCase = "";

        for (int i = 0;i<ch.length;i++){
            if (ch[i] >= 'A' && ch[i] <= 'Z' ){
                lowerCase += (char)(ch[i]+32);
            }else lowerCase += ch[i];
        }
        for (int i = 0;i<ch.length;i++){
            if (ch[i] >= 'a' && ch[i] <= 'z' ){
                upperCase += (char)(ch[i] - 32);
            }else upperCase += ch[i];
        }

        System.out.println("Upper Case -->  "+upperCase);
        System.out.println("LowerCase --> "+lowerCase);
    }
}
