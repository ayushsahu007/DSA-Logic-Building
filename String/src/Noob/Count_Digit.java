package Noob;

import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countDigit = 0;
        boolean flag = true;
        char[] ch = str.toCharArray();
        for (int i = 0;i<ch.length;i++){
            if (ch[i] >= '0' && ch[i] <= '9'){
                countDigit++;
                flag = false;
            }
        }
        if (flag == false){
            System.out.println("Digit Count - "+countDigit);
        }else {
            System.out.println("No Any Digit Found");
        }
    }
}
