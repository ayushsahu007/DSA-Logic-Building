package Basic;

import java.util.Scanner;

public class FInd_1st_Non_Repeated_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++){
            int count = 1;
            for (int j = i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j] = 0;
                }
            }if (ch[i]!=0 && count == 1){
                System.out.print(ch[i]);
                return;
            }

        }
    }
}
