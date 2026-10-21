package Noob;

public class Reverse_Each_Element {
    public static void main(String[] args) {
        int arr[] = {12,34,23,64,74,23};
        for (int i=0;i<arr.length;i++){
            arr[i] = reverse(arr[i]);
        }
        for (int rev : arr){
            System.out.println(rev);
        }

    }
    public static int reverse(int num){
        int reverse = 0;
        while (num !=0 ){
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        return reverse;
    }
 }
