package Noob;

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        String lowerCase = str.toLowerCase();
        char[] ch = lowerCase.toCharArray();

        for (int i = 0;i<ch.length;i++){
            if (ch[i] == 'a' || ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u'){
                continue;
            }
            System.out.print(ch[i]);
        }
        sc.close();
    }
}
