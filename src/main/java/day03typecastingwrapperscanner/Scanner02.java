package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        // Example 1 : Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz...");
        double sayi1 = scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz...");
        double sayi2 = scan.nextDouble();
        System.out.println(sayi1 + sayi2);

        // Integer bir deger yazabilirsin, java bunu double in icine koymak icin auto widening yapar.


    }
}
