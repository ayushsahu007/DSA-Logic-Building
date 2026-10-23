package Basic;

public class Find_Distinct_Value {
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 12, 13, 9, 17,5,3,7,10};
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            if ( arr[i] > 0){
                System.out.println(arr[i]);
            }

        }
    }
}
