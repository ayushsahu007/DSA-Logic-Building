package Noob;

public class Count_Even_Odd {
   public static void main(String[] args) {
        int[] arry = {1,2,3,4,5};
        int count_even = 0;
        int count_odd=0;
        for (int i = 0;i<arry.length;i++){
            if (arry[i] % 2 == 0){
                count_even++;
            }else {
                count_odd++;
            }
        }
        System.out.println("Even Count + "+ count_even);
        System.out.println("Odd Count + "+ count_odd);
    }
}
