package Basic;

import java.util.Scanner;

public class CountFrequencyUpperLowerCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        System.out.println("\nUppercase Characters:");

        // Count Uppercase Characters
        for (int i = 0; i < ch.length; i++) {

            int count = 1;

            if (ch[i] >= 'A' && ch[i] <= 'Z') {

                for (int j = i + 1; j < ch.length; j++) {

                    if (ch[i] == ch[j]) {
                        count++;
                        ch[j] = 0;
                    }
                }

                if (ch[i] != 0) {
                    System.out.println(ch[i] + " --> " + count);
                    ch[i] = 0;
                }
            }
        }

        System.out.println("\nLowercase Characters:");

        // Count Lowercase Characters
        for (int i = 0; i < ch.length; i++) {

            int count = 1;

            if (ch[i] >= 'a' && ch[i] <= 'z') {

                for (int j = i + 1; j < ch.length; j++) {

                    if (ch[i] == ch[j]) {
                        count++;
                        ch[j] = 0;
                    }
                }

                if (ch[i] != 0) {
                    System.out.println(ch[i] + " --> " + count);
                }
            }
        }

        sc.close();
    }
}