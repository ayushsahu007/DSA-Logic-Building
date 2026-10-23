package Noob;

public class Sum_of_Each_Digit {
    public static void main(String[] args) {
        int[] arr = {123, 45, 678, 9};
        for (int i = 0;i<arr.length;i++){
            int sum = sum_of_digit(arr[i]);
            System.out.println(arr[i] + " Sum is --> "+sum);
        }
    }
    public static int sum_of_digit(int num){
        int sum = 0;
        while (num != 0){
            int digit = num%10;
            sum+= digit;
            num = num/10;
        }
        return sum;
    }
}
