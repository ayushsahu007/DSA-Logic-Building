package Basic;

import java.util.Scanner;

public class DisplayLast4Digit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Mobile Number - ");
        String mobile = sc.nextLine();

        if (!mobile.matches("[0-9]{10}")) {
            System.out.println("Please enter a valid 10-digit mobile number.");
            sc.close();
            return;
        }

        char[] ch = mobile.toCharArray();

        for (int i=0;i<ch.length-4;i++){
            ch[i] = '*';
        }

        for (char c : ch){
            System.out.print(c);
        }
        sc.close();
    }
}
