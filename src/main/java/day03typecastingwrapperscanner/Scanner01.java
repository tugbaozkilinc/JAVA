package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    // Scanner : Disaridaki datayi kodumun icine tasir. Butun application lar kullanici ile interactive calisir.
    // Bir java class idir. Java nin icinde bir suru library var. (Ilk once util kutuphanesini kullanacagiz.) Bu kutuphanenin icinde bir suru class var.
    // Bunlardan biri Scanner class. Bu class in icinde kullanicidan data almayi saglayan method lar ve variable lar var.)
    // Once java ya sonra util kutuphanesine sonra da Scanner class ina gelecegim. Disaridan birsey almaya import denir. Ilk is Scanner class i import etmek
    // gerekir kullanabilmek icin. Scanner class i util kutuphanesindedir. (java.util.Scanner) (Scanner yaz enter a bas otomatik import eder.)
    // System.in : Sistemin icine birsey koymak istiyorum. System.out : Sistemin disi

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   // Yeni bir object olusturduk.
        System.out.println("Hey kullanici yasini gir...");
        byte age = scan.nextByte();
        System.out.println("Hey kullanici senin yasin: " + age);



    }
}
