package Basic;

import java.util.Scanner;

public class Find_1st_Repeated_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    System.out.println(ch[i]);
                    return;
                }
            }
        }

        System.out.println("No repeated character found");
        sc.close();
    }
}
