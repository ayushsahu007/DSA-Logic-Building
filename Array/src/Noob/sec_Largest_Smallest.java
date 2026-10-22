package Noob;

public class sec_Largest_Smallest {
    public static void main(String[] args) {
        int[] arr = {30,25,20,15,3,10,31};
        int lar = Integer.MIN_VALUE;
        int sec_lar = Integer.MIN_VALUE;

        int small = Integer.MAX_VALUE;
        int sec_small = Integer.MAX_VALUE;

        for (int i = 0;i<arr.length;i++){
            //For Largest Element
            if (arr[i]>lar){
                sec_lar = lar;
                lar =  arr[i];
            } else if (arr[i] != lar  && arr[i] > sec_lar){
                sec_lar = arr[i];

                //For Smallest Element
            } else if (arr[i] < small) {
                 sec_small= small;
                small = arr[i];
            } else if (arr[i] != small && arr[i] < sec_small) {
                sec_small = arr[i];
            }
        }
        System.out.println(sec_lar);
        System.out.println(sec_small);
    }
}
