package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        // Example 1: Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinesi yapiniz.

        // Not: switch de sadece int, byte, short, char, String data tipleri kullanilabilir. switch() in parantez icindeki data type i kastediliyor.
        // Not: Eger 3 den fazla durum var ise switch() tercih ederim. (Suleyman hocanin tercihi.)

        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz, +, -, *, /, %");
        char islem = input.next().charAt(0);
        System.out.println("Ilk sayiyi giriniz");
        double n1 = input.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double n2 = input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '%':
                System.out.println(n1 * n2 / 100);
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");
        }


    }
}
