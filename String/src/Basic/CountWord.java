package Basic;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word - ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        int count = 0;

        if (!str.isEmpty()) {
            count = 1;

            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] == ' ' && ch[i + 1] != ' ') {
                    count++;
                }
            }
        }

        System.out.println("Total words are - " + count);

        sc.close();
    }
}