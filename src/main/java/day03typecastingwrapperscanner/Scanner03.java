package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // Example 1 : Kullanicidan bir dikdortgenin kisa ve uzun kenarini alip alan ve cevresini hesaplayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        int en = input.nextInt();
        System.out.println("Dikdortgenin uzun kenarini giriniz");
        int boy = input.nextInt();
        System.out.println("Alan: " + en * boy + " Cevre: " + 2 * (en + boy));

        // Double bir deger yazamazsin, senin double degeri int a koyabilmen icin explicit narrowing yapman lazim.




    }
}
