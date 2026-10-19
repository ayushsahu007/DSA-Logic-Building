package Noob;

public class Count_Pos_Neg_Zero {
    public static void main(String[] args) {
        int arr[] = {1,38,-34,3,0,23,-98,0,33,-90,34};
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i=0; i<arr.length;i++){
            if (arr[i] > 0){
                pos++;
            }else if (arr[i]<0){
                neg++;
            }else {
                zero++;
            }
        }
        System.out.println("Positive - "+pos+" | Negative - "+neg+
                " | Zero - "+zero);
    }
}
