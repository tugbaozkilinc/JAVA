package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // Kullanicidan ilk, orta ve soy ismini, kimlik numarasini aliniz ve asagidaki formatta ekrana yazdiriniz
        // Ali Mert Can
        // 123456789

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz...");
        String ilkIsim = scan.next();
        System.out.println("Orta isminizi giriniz...");
        String ortaIsim = scan.next();
        System.out.println("Soy isminizi giriniz...");
        String soyIsim = scan.next();
        System.out.println("Kimlik numaranizi giriniz...");
        String kimlikNo = scan.next();

        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
        System.out.println(kimlikNo);


    }
}
