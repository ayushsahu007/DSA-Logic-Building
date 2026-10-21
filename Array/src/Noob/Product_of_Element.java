package Noob;

public class Product_of_Element {
  public static void main(String[] args) {
        int[] arry = {1,2,3,4,5};
        int product = 1;
        for(int i = 0;i<arry.length;i++){
            product*=arry[i];
        }
        System.out.println(product);
    }
}
