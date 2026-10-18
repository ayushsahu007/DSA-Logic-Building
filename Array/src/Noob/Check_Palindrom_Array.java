package Noob;

public class Check_Palindrom_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        boolean flag = false;
        for (int i = 0;i<arr.length/2;i++){

            if (arr[i] == arr[arr.length-1-i]){
                flag = true;
            }
        }
        if (flag){
            System.out.println("Array is Palindrom");
        }else{
            System.out.println("Array is Not Palindrom");
        }
    }
}
