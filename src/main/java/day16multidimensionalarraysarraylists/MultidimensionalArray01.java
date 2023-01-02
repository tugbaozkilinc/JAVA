package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultidimensionalArray01 {

    public static void main(String[] args) {

        // Note: for-each loop index le calismaz. Array veya Collection varsa for-each loop kullanmak ilk tercihiniz olsun. Array veya Collection varsa
        // ama index kullanmak zorundaysan o zaman for-each loop index le calismadigi icin for loop veya while loop veya do while loop kullanmalisiniz.

        // Bir tane integer multidimensional Array olusturunuz ve bu Array deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;

        for (int[] w : arr){
            for (int z : w){
                sum = sum + z;
            }
        }

        System.out.println(sum);

        // Example 1: Bir multidimensional Array i normal Array e ceviren kodu yaziniz.

        int brr[][] = {{2, 5, 1}, {32, 75}};
        int length = 0;
        int idx = 0;

        for (int[] w : brr){
            length = length + w.length;
        }

        int []crr = new int[length];

        for (int[] w : brr){
            for (int z : w){
                crr[idx] = z;
                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));



    }
}
