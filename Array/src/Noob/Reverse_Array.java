package Noob;

public class Reverse_Array
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = 0;i<arr.length/2;i++){
            int tem = 0;
            tem = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tem;
        }
        for (int num : arr){
            System.out.println(num);
        }
    }
}
