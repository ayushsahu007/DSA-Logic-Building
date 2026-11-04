package Noob;

import java.util.Scanner;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        char[] ch = str.toCharArray();
        for (int i = 0;i<ch.length;i++){
            if (ch[i] >= '0' && ch[i] <= '9'){
                sum = sum + (ch[i] - '0');
            }
        }
        System.out.println("Sum of Digit is - "+sum);
    }
}
