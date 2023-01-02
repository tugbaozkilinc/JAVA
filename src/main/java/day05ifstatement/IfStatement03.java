package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        // Example 1: Kullanicidan gun isimlerini aliniz, o gunun hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Gun ismi giriniz");
        String gun = input.next();

        // 1. yol:

        if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu");
        } else if (gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("Sali")){
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("Carsamba")){
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("Persembe")){
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici");
        } else if (gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

        // Kodu kisa yazmak tercih edilir ve buna atomik structure denir. Kodunu atomik yapmaya calismalisin. Kod yazarken bir satira en fazla 80 karakter yazarlar.
        // Bu trafik kurallari gibi bir kural degil. Genel uygulama boyle.

        // 2. yol:

        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                   gun.equalsIgnoreCase("Sali") ||
                   gun.equalsIgnoreCase("Carsamba") ||
                   gun.equalsIgnoreCase("Persembe") ||
                   gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

        // 3. yol:

        // Code standartlari: 1. Tekrardan kacin. 2. Parantez icine yazdigin kodu kisa tut. Standartlara uygun olmali. Bizim kodlarimiz baskalari tarafindan
        // kontrol edilir (code review) ve bu kontrolde kod standartlari dikkate alinir.

        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci = gun.equalsIgnoreCase("Pazartesi") ||
                           gun.equalsIgnoreCase("Sali") ||
                           gun.equalsIgnoreCase("Carsamba") ||
                           gun.equalsIgnoreCase("Persembe") ||
                           gun.equalsIgnoreCase("Cuma");

        if (haftaSonu){
            System.out.println("Hafta sonu");
        } else if (haftaIci){
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

        

    }
}
