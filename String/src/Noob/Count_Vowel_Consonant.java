package Noob;
import java.util.Scanner;

public class Count_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        String lowerCase = str.toLowerCase();
        char[] ch = lowerCase.toCharArray();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0;i<ch.length;i++){
            if (ch[i] == 'a' || ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u') vowelCount++;
            else consonantCount++;
        }
        System.out.println("Vowel  - " +vowelCount);
        System.out.println("Consonant - " + consonantCount);


    }
}
