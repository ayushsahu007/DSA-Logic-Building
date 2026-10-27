package Basic;

public class Merge_Two_Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10};
        int[] brr = new int[arr1.length + arr2.length];

        for (int i = 0;i<arr1.length;i++){
            brr[i] = arr1[i];
        }

        for (int i = 0 ; i<arr2.length;i++){
            brr[arr1.length+i] = arr2[i];
        }
        for (int ele : brr){
            System.out.println(ele);
        }
    }

}
