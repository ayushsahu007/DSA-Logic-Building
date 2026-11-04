package Noob;

import java.util.Scanner;

public class Toggle_Each_Chracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String s = "";

        for (int i = 0;i<ch.length;i++){
            if (ch[i] >= 'A' && ch[i] <= 'Z' ){
                s += (char)(ch[i]+32);
            }else if(ch[i] >= 'a' && ch[i] <= 'z' ){
                s += (char)(ch[i]-32);
            }else {
                s += ch[i];
            }
        }

        System.out.println("Toggle Case -->  "+s);
    }
}
