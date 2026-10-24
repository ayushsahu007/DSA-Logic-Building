package Noob;

public class Sum_of_Element {
   public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int sum = 0;
        for(int i=0;i<arr1.length;i++){
            sum+= arr1[i];
        }
        System.out.println(sum);
    }
}
