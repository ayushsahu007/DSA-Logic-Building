package Basic;

public class Insert_Element {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 9,23,65,28,73};
        int idx = 4;
        int ele = 15;
        int[] brr = new int[arr.length+1];
        for (int i = 0;i<idx;i++){
            brr[i] = arr[i];
        }
        brr[idx] = ele;

        for (int i = idx; i<arr.length;i++){
            brr[i+1] = arr[i] ;
        }

        for (int num : brr){
            System.out.println(num);
        }
    }
}
