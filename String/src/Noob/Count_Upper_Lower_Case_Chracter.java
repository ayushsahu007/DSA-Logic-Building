package Noob;

import java.util.Scanner;

public class Count_Upper_Lower_Case_Chracter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int countUpper = 0;
       int countLower = 0;
       char[] ch = str.toCharArray();
       for (int i=0;i<ch.length;i++){
           if (ch[i] >= 'A' && ch[i]<= 'Z'){
               countUpper++;
           }
            if (ch[i] >= 'a' && ch[i]<= 'z'){
               countLower++;
           }
       }

        System.out.println("Upper Character Count - "+countUpper);
        System.out.println("Lower Character Count - "+countLower);

    }

}
