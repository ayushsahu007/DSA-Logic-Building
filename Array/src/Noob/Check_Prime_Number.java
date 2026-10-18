package Noob;

public class Check_Prime_Number {
    public static void main(String[] args) {
        int[] arr = {10, 7, 5, 12, 13, 9, 17};

        for (int i =0;i<arr.length;i++){
            boolean value = primeNumber(arr[i]);
            if (value){
                System.out.println(arr[i] + " ->  is Prime");
            }else {
                System.out.println(arr[i] + " ->  is Not Prime");
            }

        }
    }

    public static boolean primeNumber(int num){

        boolean isPrime = true;
        for (int i = 2; i<num/2;i++){
            if (num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
