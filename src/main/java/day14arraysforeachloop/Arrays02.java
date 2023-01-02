package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        //            [2, 3, 12, 0,  0,  0]

        int[] original = {0, 2, 3, 0, 12, 0};
        int[] yeni = new int[original.length];
        int idx = 0;

        for (int i = 0; i< original.length; i++){
            if (original[i]!=0){
                yeni[idx] = original[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(yeni));

        // Example 2: Bir Array in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz.
        // [2, 1, 2, -3, 2] ==> Kullanici 2 yi sordu; 2 elemani var ve 3 kere tekrarlandi.
        //                  ==> Kullanici 6 yi sordu; 6 elemani yok.

        int[] arr = {5, 1, 5, -3};
        int element = 5;
        int count = 0; // flag: Bazi durumlarin olup olmadigini kontrol etmek icin kullanilir.

        for (int w : arr){
            if (w==element){
                count++;
            }
        }

        if (count>0){
            System.out.println(element + " Array de var " + count + " kere tekrarlandi");
        } else {
            System.out.println(element + " Array de yok ");
        }

        // Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        String words[] = sentence.replaceAll("\\p{Punct}","").split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));  // words Array inin elemanlarini compare et, Comparator kullan karsilastirmayi String lerin uzunluklarina gore yap.
        System.out.println(Arrays.toString(words)); // [ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        System.out.println(words[words.length-1]);



    }
}
