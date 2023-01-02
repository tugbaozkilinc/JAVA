package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        // Example 1: Bir Integer ArrayList teki 7 haric tum elemanlari 2 arttiriniz.

        List<Integer> ages = new ArrayList<>(); // list ismi verilirken genelde cogul isim verilir.
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (int w : ages){
            if (w==7){
                continue;
            }
            ages.set(ages.indexOf(w), w+2); // w = w + 2; List ler boyle update edilemezler, list teki elemanlari degistirmek icin set kullanmalisin. Bu kod integer lari degistirmek icin kullanilir.
        }
        System.out.println(ages);

        // Example 2: Size verilen ArrayList de 8(inclusive) ve 8 den onceki tum elemanlari iki katina cikariniz.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (int w : nums){
            nums.set(nums.indexOf(w), w*2);
            if (w==8){
                break;
            }
        }

        System.out.println(nums);


    }
}
