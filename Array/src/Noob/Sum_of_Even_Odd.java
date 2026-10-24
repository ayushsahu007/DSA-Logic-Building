package Noob;

public class Sum_of_Even_Odd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum_even = 0;
        int sum_odd = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] % 2 == 0){
                sum_even += arr[i];
            }else {
                sum_odd += arr[i];
            }
        }

        System.out.println("Sum of Even - "+ sum_even);
        System.out.println("Sum of Odd - "+ sum_odd);
    }
}
