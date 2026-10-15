package Noob;

public class Count_of_Digit {
    public static void main(String[] args) {
        int[] arr = {123, 45, 678, 9};
        for (int i = 0;i<arr.length;i++){
            int count = count_of_digit(arr[i]);
            System.out.println(arr[i] + " count is --> "+count);
        }
    }
    public static int count_of_digit(int num){
        int count = 0;
        while (num != 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
