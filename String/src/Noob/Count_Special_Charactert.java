package Noob;

import java.util.Scanner;

public class Count_Special_Charactert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0;i<ch.length;i++ ){
            if ((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')) {
                continue;
            }else {
                count++;
            }
        }

        System.out.println(count
        );
    }
}
