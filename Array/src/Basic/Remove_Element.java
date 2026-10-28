package Basic;

public class Remove_Element {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 9,23,65,28,73};
        int idx = 2;
        int[] brr = new int[arr.length-1];
        for (int i = 0;i<idx;i++){
            brr[i] = arr[i];
        }
        for (int i = idx; i<brr.length;i++){
            brr[i] = arr[i+1] ;
        }
        for (int num : brr){
            System.out.println(num);
        }
    }
}
