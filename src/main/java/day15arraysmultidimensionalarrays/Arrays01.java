package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // binarySearch() methodunu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
        // Ana kodun icine deger yazmamaya gayret ederiz. Bu deger surekli degistirilir, ama ana kod yazildiktan sonra degistirilmez.
        // Degistirmemiz gereken seyleri variable icine koyariz. Ana kodun icinde de bu variable lari kullaniriz.

        int arr[] = {12, 31, 43, 14};

        int num1 = 43;
        int num2 = 58;
        Arrays.sort(arr);
        int idx1 = Arrays.binarySearch(arr, num1);
        System.out.println(idx1);
        int result = Arrays.binarySearch(arr, num2);
        System.out.println(result);



    }
}
