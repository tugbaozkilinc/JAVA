package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // Example 1 : Kullanicidan alinan sayinin tek mi cif mi oldugunu ekrana yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = input.nextInt();

        // 1. yol:

        if (s%2 == 0){
            System.out.println("Cift sayi");
        }
        if (s%2 != 0){
            System.out.println("Tek sayi");
        }

        // 2. yol:

        if (s%2==0){
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }

        // Note: Javaya ne kadar az is yaptirirsan o kadar hizli calisir. If else lerde java true yu bulduktan sonra geri kalanina bakmaz. Ama bunlari if else statement ile
        // yaparsan java butun if leri tek tek kontrol eder.

        // Example 2: Bir sayinin negatif pozitif veya notr oldugunu soyleyen kodu yaziniz.

        System.out.println("Bir sayi giriniz");
        double d = input.nextDouble();

        if (d>0){
            System.out.println("Pozitif");
        } else if (d==0){
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");
        }




    }
}
