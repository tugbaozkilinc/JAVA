package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        // Multidimensional Array in kısa yoldan olusturulmasi

        char arr[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};

        System.out.println(Arrays.deepToString(arr));

        // Bir String Multidimensional Array de icinde a olan elemanlari consol a yazdiriniz.

        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w : brr){
            for (String z : w){
                if (z.contains("a")){
                    System.out.print(z + " ");
                }
            }
        }




    }
}
