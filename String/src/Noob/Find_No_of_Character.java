package Basic;

import java.util.Scanner;

public class Find_No_of_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Ayush";
        // Using InBuilt Method Length
        System.out.println(str.length());

        //Without Inbuilt method
        char[] ch = str.toCharArray();
        int  count = 0;
        for (int i =0;i<ch.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
