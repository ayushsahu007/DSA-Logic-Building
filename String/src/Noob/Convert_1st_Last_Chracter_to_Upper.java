package Noob;

import java.util.Scanner;

public class Convert_1st_Last_Chracter_to_Upper {
    public static void main(String[] args) {
        String s = "i Love india";
        char[] ch = s.toCharArray();
        String str = "";

        int firstLatter = 0;
        int lastLatter = ch.length-1;

        for(int i = 0;i<ch.length;i++){
            if (i == firstLatter || ch[i-1] == ' ' || i == lastLatter || ch[i+1] == ' ' ){
                if(ch[i] >= 'a' && ch[i] <= 'z'){
                    str = str+(char)(ch[i]-32);
                }else{
                    str = str+ch[i];
                }
            }else{
                if(ch[i] >= 'A' && ch[i] <= 'Z'){
                    str = str+(char)(ch[i]+32);
                }else{
                    str = str+ch[i];
                }
            }
        }
        System.out.println(str);
    }
}
