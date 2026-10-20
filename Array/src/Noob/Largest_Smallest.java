package Noob;

public class Largest_Smallest {
   public static void main(String[] args) {
       int[] arr1 = {10,20,30,40,50};
       int largest = arr1[0];
       int smallest = arr1[0];
;

       for (int i = 1;i<arr1.length;i++){
           if (arr1[i] > largest){
               largest = arr1[i];
           }
           if (arr1[i]<smallest){
               smallest = arr1[i];
           }
       }

        System.out.println(largest);
       System.out.println(smallest);
    }
}
