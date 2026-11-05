package Basic;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "triangle";
        String s2 = "integral";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int count = 0;

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for(int i = 0; i<c1.length;i++){
            for(int j = 0;j<c2.length;j++){
                if(c1[i] == c2[j]){
                    count++;
                    c2[j] = 0;
                    break;
                }
            }
        }

        if(count == c1.length){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
