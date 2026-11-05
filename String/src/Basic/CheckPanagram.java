package Basic;

import java.util.Locale;
import java.util.Scanner;

public class CheckPanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String - ");
        String str = sc.nextLine();
       boolean flag = isPanagram(str);
       if (flag == true){
           System.out.println("String is Panagram");
       }else {
           System.out.println("String is Not panagram");
       }
    }
    public static boolean isPanagram(String s){
        boolean[] bool = new boolean[26];
        s = s.toLowerCase();

        for (int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                bool[ch - 'a'] = true;
            }
        }

        for (boolean b : bool){
            if (!b){
                return false;
            }
        }
        return true;
    }
}
