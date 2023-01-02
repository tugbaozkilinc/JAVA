package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
          ArrayList ler ayni data type a sahip birden fazla data yi depolamak icin kullanilir. Array ile ArrayList in farki;
          1. Array olustururken Array in icine kac tane eleman koymamiz gerektigini soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz.
          Array ler eleman sayisinda fixed dirler. ArrayList leri olustururken eleman sayisini soylemeye gerek yoktur, cunku ArrayList ler eleman sayisinda flexible dirlar.
          2. Array lerin icine primitive ve reference lar koyulabilir. ArrayList lerin icine ise sadece non-primitive ler koyulabilir.
          3. Array ler super fast yani cok hizlidirlar ve memory i cok az kullanirlar.
          Note: Eger length hakkinda eminsen Array kullan. Eleman sayisi kesin belli olan coklu data lari depolamak icin Array kullaniriz,
          eleman sayisi degisken olan coklu data lar icin Array kullanma riskini almayiz.
        */

        // ArrayList nasıl olusturulur

        // 1. yol
        ArrayList<Integer> age = new ArrayList<Integer>();

        // 2. yol
        ArrayList<Integer> heights = new ArrayList<>();

        // 3. yol
        List<Integer> nums = new ArrayList<>();

        // ArrayList ler nasil yazdirilir

        System.out.println(nums);

        // ArrayList lere nasil eleman eklenir
        // add() her zaman elemani en sona ekler (insertion order)
        // add() methodu boolean return eder. true; gorev tamam false; yerlestirilemedi manasindadir.
        // System.out.println(nums.add(21)); // true

        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums); // [21, 18, 20]

        nums.add(1,50);  // Hicbirsey return etmez methodun yaninda void yaziyor.
        System.out.println(nums); // [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices); // Liste list ekleme.
        System.out.println(nums); // [21, 50, 18, 20, 23, 185]
        System.out.println(prices); // [23, 185]

        nums.addAll(2, prices);
        System.out.println(nums); // [21, 50, 23, 185, 18, 20, 23, 185]

        // ArrayList lerin eleman sayisi nasil bulunur

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);

        // ArrayList lerde herhangi bir eleman nasil secilir

        int eleman1 = nums.get(3);
        System.out.println(eleman1);

        // ArrayList in bos olup olmadigini nasil anlariz

        boolean bos1 = nums.isEmpty();
        System.out.println(bos1); // false
        boolean bos2 = age.isEmpty();
        System.out.println(bos2); // true

        // ArrayList de bir eleman nasil degistirilir

        nums.set(3, 200);
        System.out.println(nums); // [21, 50, 23, 200, 18, 20, 23, 185]

        // Example 1: nums ArrayList indeki tum tek sayilari 11 arttirdiktan sonra ekrana yazdiriniz.
        for (Integer w : nums){ // int de olur. Burda mumkunken int kullaniriz daha az yer kapladigi icin.
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }
        }

        System.out.println(nums); // [32, 50, 34, 200, 18, 20, 34, 196]

        // Example 2: ArrayList den 34 elemanini siliniz.
        Integer sayi = 34; // Bu artık non primitive. Non primitive leri java index olarak kabul etmez onun icin 34 u siler.
        nums.remove(sayi); // Buraya 34 yazarsak java bunu primitive kabul eder(primitive ler ArrayList lerin elemani olamazlar), tum sayilar java tarafindan primitive kabul edilir
                           // memory i korumak icin.
        // nums.remove((Integer) 34);
        System.out.println(nums); // [32, 50, 200, 18, 20, 34, 196] remove methodu ilkini siler.

        // Note: Tum tam sayilar java icin aksi soylenmedikce primitive yani int dir.
        // Primitive ler ArrayList lerin elemani olamazlar. List ler non primitive depolar. (34 koydugunda java bu eleman olamaz index olur diyor.)
        // Primitive i wrapper class a cevirirseniz non-primitive olur ve non primitive ler ArrayList lerin elemani olur, index i olamaz.
        // List ler Collections lardan birisidir. for each ilk akla gelen loop tur.
        // Java da ustu cizili bir sey gorursen bu yeni versiyonda kalkmis demektir.


    }
}
