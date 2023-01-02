package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        // Example 1: Bir List deki elemanlardan birbirine en yakin olan ikisini bulunuz.
        //            [12, 19, 15, 30, 21]  ==>  19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

        Collections.sort(a); // Bunu mutlaka kullanmalisin, cunku biz burda sadece bir elemanin kendinden bir onceki ve bir sonraki eleman ile farkini aliyoruz.
        int minFark = Integer.MAX_VALUE; // Iki sayinin arasinda bizim verdigimiz degerden daha buyuk bir fark olabilir, bu durumda bizim
                                         // verdigimiz degeri minimum fark olarak alacaktir, bunun olmamasi icin burayi olabildigince buyuk tutuyoruz.
                                         // a.get(1)-a.get(0) ==> 2. yol
        for (int i = 1; i<a.size(); i++){
            minFark = Math.min(minFark, a.get(i)-a.get(i-1));
        }

        for (int i = 1; i<a.size(); i++){
            if (a.get(i)-a.get(i-1)==minFark){
                System.out.println(a.get(i) + " - " + a.get(i-1) + " = " + minFark);
            }
        }

        // Array ler list lere gore memory de daha az yer kaplarlar ve daha hizlidirlar. List lerin icine reference ve primitive koyamazsin.

    }
}
