package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        // Kodunu test et. Developer kod yazar ve kendi kodunu unit test ile test eder. QA ler kod ve unit testi alip test yapar. Her turlu senaryoyu test ederler.
        // Cunku kullanicilar herseyi denerler. Kritik degerleri test ederler. Bu degerlerden buyuk kucuk herhangi bir deger test edilmelidir.
        // Her deger icin application bir sey demeli yoksa uygulama dondu zanneder kullanici.

        // Example 1: Kullanici gun numarasini girsin kod gun ismini yazsin.

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunNo = input.nextByte();

        if (gunNo==1){
            System.out.println("Pazar");
        } else if (gunNo==2){
            System.out.println("Pazartesi");
        } else if (gunNo==3){
            System.out.println("Sali");
        } else if (gunNo==4){
            System.out.println("Carsamba");
        } else if (gunNo==5){
            System.out.println("Persembe");
        } else if (gunNo==6){
            System.out.println("Cuma");
        } else if (gunNo==7){
            System.out.println("Cumartesi");
        } else {
            System.out.println("Gecerli gun numarasini giriniz. Gecerli gun numaralari 1, 2, 3, 4, 5, 6, 7 den birisidir.");
        }






    }
}
