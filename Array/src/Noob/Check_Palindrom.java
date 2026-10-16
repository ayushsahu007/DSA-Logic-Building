package Noob;

public class Check_Palindrom {
    public static void main(String[] args) {
        int[] arr = {121, 123, 444, 567, 22, 100};

        for (int num : arr) {

            int original = num;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if (original == reverse) {
                System.out.println(original + " is Palindrome");
            } else {
                System.out.println(original + " is Not Palindrome");
            }
        }
    }
}
