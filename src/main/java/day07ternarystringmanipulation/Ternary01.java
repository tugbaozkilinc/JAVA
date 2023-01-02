package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        // Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz.

        // 1. yol

        int a = 12;

        if (a>0){
            System.out.println("Pozitif");
        } else {
            System.out.println("Pozitif degil");
        }

        // 2. yol

        String result = a>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(result);

        // Example 2: Iki sayidan kucuk olani secen kodu yaziniz.

        int b = 12;
        int c = 23;
        int min = b<c ? b : c;
        System.out.println(min);

        // Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.

        int d = -45;
        int abs = d<0 ? -d : d;
        System.out.println(abs);

        // Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise islem yapamam mesaji veriniz.

        int e = 12;
        int f = 10;
        Object operation = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem yapamam";
        System.out.println(operation);

        // Note: && ile || operatorunu bir arada kullanirsan parantez kullanman tavsiye edilir. Ternary de farkli data type de sonuclar
        // alindiginda ikisine de uyan data type (Object) secilir.
        // Note: Javada bir suru class var(Integer, String, Double..) ve bu class larin hepsinin ortak bir parent i var; Object class.
        // Javada her class in en az bir tane parent class i vardir. Javada parent class i olmayan tek class vardir o da Object class dir.




    }
}
