package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        // Example : Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz.

        // 1. Yol

        Scanner scan = new Scanner(System.in);
        // System.out.println("Ilk isminizi giriniz");
        // char ilk = scan.next().charAt(0);
        // System.out.println("Soy isminizi giriniz");
        // char son = scan.next().charAt(0);

        //System.out.println("" + ilk + son);

        // Note : Char lar ascii degerlere sahiptir. Eger matematiksel islem yapiyorsan java char larin ascii degerlerini kullanir. " + " isaretinin
        // iki anlami vardir; birinci anlami toplama islemi ikinci anlami birlestirme islemidir. Java " + " sembolu gorunce once toplama yapmaya calisir yapamiyorsa
        // birlestirmeyi dener onu da yapamiyorsa hata verir.
        // Birlestirmenin sonucu her zaman String cikar.
        // Ornegin System.out.println('A' + 'C') ekrana AC yerine 132 yazdirir.

        // 2. Yol

        System.out.println("Tam isminizi giriniz");
        String tamIsim = scan.nextLine();
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);

        // Tam ismi bosluktan split ile kesince elimdeki iki parca icin Java index kullanir.(Biz bir Stringi split ile parcalayinca parcalari array in icine koyuyoruz.)
        // tamIsim (Ali Can) .split(" ") ile bosluktan parcaladim, iki parca olustu [Ali, Can] Ali index 0, Can index 1 ben birinci index i aldim [1].charAt(0) ile de
        // bu birinci indexin 0. index ini aldim

        System.out.println(soyIsminIlkHarfi);



    }
}
