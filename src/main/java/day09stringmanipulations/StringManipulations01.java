package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        // indexOf() methodu verilen karakter veya karakterlerin ilk gorunumunun index ini verir.

        String str = "Kara kara dusunme Ankara";
        int idxA1 = str.indexOf("kara");
        System.out.println(idxA1); // 5

        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2); // 20

        // lastIndexOf() methodu verilen karakter veya karakterlerin son gorunumunun index ini verir.

        String s = "Mississippi";
        int idxI = s.indexOf('i');
        System.out.println(idxI); // 1

        int idxIss1 = s.indexOf("iss");
        System.out.println(idxIss1); // 1

        int idxIss2 = s.lastIndexOf("iss");
        System.out.println(idxIss2); // 4

        // Example 1: Bir String deki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz. "Helloooo" H==>tekrarsiz o==>tekrarli
        String t = "Helloooo";
        char c = 'e';  // Note: Kodun icinde deger degisikligi yapmak iyi sayilmaz, bu yuzden ayri bir variable olusturduk.

        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }

        String u = "Learn java earn money";
        int sonuc = u.indexOf("a",7);
        System.out.println(sonuc); // 7

        int son = u.lastIndexOf("a",9);
        System.out.println(son); // 9

        String v = " ";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu); // false

        // Note: length()==0 demek isEmpty() true verir demek. isEmpty() i kullanmayi tercih etmelisin, cunku java burda daha az is yapiyor.
        // Javada bir method varsa onu kullanmaliyiz, yoksa kendi mantigimizi kullanabiliriz.

        String x = " ";
        boolean blankMi = x.isBlank();
        System.out.println(blankMi); // true

        // isBlank() hem bos String icin hem de sadece space iceren String ler icin true return eder.

        // Example 2: Kullanicidan alinan isim mutlaka space ten farkli en az bir karakter icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        String ilk = input.nextLine(); // next() i kabul etmedi, cunku next() ilk bosluga kadar kabul eder.

        if (ilk.isBlank()){
            System.out.println("Gecerli bir isim giriniz.");
        } else {
            System.out.println(ilk);
        }



    }
}
