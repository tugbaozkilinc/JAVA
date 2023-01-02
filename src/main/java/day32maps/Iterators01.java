package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // Note: Loop lar kendi baslarina Collection lari update edemezler, bu yuzden java iterator lari olusturdu.
        // for loop kullanarak her elemanin sonuna "!" ekleyiniz.
        for(String w : myList){
            w = w + "!";
        }
        System.out.println(myList); // [Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator(); // Obje olusturmak icin iki yontemimiz vardi; 1. new ile yoktan var etmek 2. var olan dan obje uretmek
        while (itr.hasNext()){ // hasNext() method u ListIterator da en basta bulunan pointer a senden sonra eleman var mi diye sorar.
            String el = itr.next(); // next() method u pointer i sonraki elemanin onune koyar ve ustunden atladigi elemani verir.
            itr.set(el + "!");
        }
        System.out.println(myList); // [Z!, K!, A!, J!, M!]





    }
}
