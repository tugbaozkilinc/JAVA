package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: Verilen pozitif ve negatif sayilar iceren bir int Array deki en buyuk negatif ve en kucuk pozitif elemani bulunuz.
        // Array varsa for each aklimiza ilk gelen loop olmalidir.

        int arr[] = {-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);
        int maxNegative = arr[0];
        int minPositive = arr[arr.length-1]; // Pozitif sayilar en sagda olacagi icin bunu sectik.

        for (int w : arr){
            if (w<0){
                maxNegative = Math.max(maxNegative, w);  // bu ikisinden buyugunu sececek maxNegative e koyacak
            }
            if (w>0){
                minPositive = Math.min(minPositive, w);  // if else kullanmadik, cunku burda 3 durum var 2 durum yok.
            }
        }
        System.out.println("Maximum negative value is: " + maxNegative);
        System.out.println("Minimum positive value is: " + minPositive);



    }
}
