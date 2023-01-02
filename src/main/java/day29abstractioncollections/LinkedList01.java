package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
      Iterable
              --> Collection
                            --> List  (List lere coklu ve tekrarli data depolamak istedigimizde ihtiyac duyariz. Bir okuldaki ogrenci isimleri gibi)
                            --> Queue (FIFO; FirstInFirstOut; ilk giren ilk cikar. Mesela marketin deposuna giren ilk urun ilk cikar ki son kullanma tarihi gecmesin.
                                       LIFO; LastInFirstOut; son giren ilk cikar. Mesela otobuse son giren ilk cikar ki diger yolcular otobusten inebilsin.
                                       FIFO veya LIFO gerektiginde Queue kullanilir. Mesela bir bankanin sira application inda gelen musteriyi depolamak icin, bankada FIFO
                                       calistigindan dolayi List yerine Queue kullanilir.)
                            --> Set   (Set lere coklu ama tekrarsiz(unique) data depolamak istedigimizde ihtiyac duyariz. Bir okuldaki ogrenci id leri ya da ogrencilerin
                                       email adres leri gibi.)
    */

    // ArrayList’ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
    // Cunku bircok elemanin re-index edilmesi gerekir. LinkedList eleman ekleme ve eleman silmede cok basarilidir, fakat index lerle calismadigi icin eleman
    // bulmada basarili degildir. ArrayList ise eleman bulma(search) islemlerinde cok basarilidir.
    // Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.
    // Note: Hangi durumlarda cokca ekleme ve cikarma islemi yapmaya ihtiyac duyariz?
    // Mesela muzeye gelen ziyaretcilerle ilgili bir application da ziyaretci giris cikisi cokca olacagi icin ziyaretcilerin isimlerini depolamada LinkedList kullaniriz.
    // Bu da application i daha kaliteli ve daha hizli yapar.
    // Mesela bir sozluk application inda bir kez ekleme ve cokca search islemi yapilir, bu yuzden data lari toplamak icin ArrayList kullanilir.
    // America daki sehirlerin isimlerini depolamak icin ArrayList kullanilir. Cunku sehir isimleri icin ekleme ve cikarma islemi cok az, search islemi ise cokca yapilir.

    /*
      1. LinkedList deki her eleman iki bolumden olusur; Data bolumu, pointer bolumu
      2. LinkedList deki her bir eleman "Node"(düğüm) olarak adlandirilir.
      3. LinkedList ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar.
      4. LinkedList ler eleman arama islemlerinde basarisizdirlar.
      5. 3. ve 4. maddelerden dolayi eleman ekleme ve eleman silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir.
      6. ArrayList ler index kullanir, LinkedList ler index kullanmaz.
      7. Index kullanma eleman bulma islemlerinde basariyi arttirir. Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz.
    */

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2, "Angelina Jolie"); // Bu kod index kullanmaz fakat java kodun anlasilir olmasi icin buraya index yazmistir, index in arkasinda pointer calisir.
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");
        System.out.println(visitors); // [Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkın");
        System.out.println(visitors); // [Cuneyt Arkın, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors); // [Cuneyt Arkın, Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        visitors.removeFirst();
        System.out.println(visitors); // [Tom, Hanks, Angelina Jolie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors); // [Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors); // [Tom, Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        // Removes and returns the first element of the list.
        // This method equals to removeFirst()
        // Throws: NoSuchElementException - if the list is empty
        String firstEl = visitors.pop(); // Cut + Paste
        System.out.println(firstEl); // Tom
        System.out.println(visitors); // [Hanks, Angelina Jolie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList<String> myList = new LinkedList<>();
        // myList.pop(); // NoSuchElementException



    }
}
