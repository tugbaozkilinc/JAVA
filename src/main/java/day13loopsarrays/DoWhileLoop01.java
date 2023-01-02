package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // Example 1: Kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana Kazandin! yazdiriniz. Aksi halde Kaybettin! yazdiriniz.

        Scanner input = new Scanner(System.in);
//      int s = 0; // Declaration i asagida yaparsam condition icinde kullanamam, cunku scope disi olur. // Local variable a deger atamak zorundayiz java atama yapmaz.
//
//      do {
//
//          System.out.println("Bir sayi giriniz.");
//          s = input.nextInt();
//          if (s<100){
//              System.out.println("Kazandiniz!");
//          }
//
//      }while (s<100);
//
//      System.out.println("Kaybettiniz!");

        // Note: Burda decrement-increment i user yapiyor.

        // Example 2: Kullanicidan isimler aliniz, ilk harfinin buyuk harf olup olmadigini kontrol ediniz.

//        do {
//            System.out.println("Isim giriniz.");
//            char initial = input.next().charAt(0);
//
//            if (initial>='A' && initial<='Z'){
//                System.out.println("Ismi basariyla girdiniz");
//            } else {
//                System.out.println("Ismi yanlis girdiginiz icin isleminiz iptal edilmistir.");
//                break;
//            }
//        }while (true); // Burda sonsuz dongu olusturdum yukarıda bunu break; ile kırdım. Bu sekilde sonsuz dongu olusturabilir sonra da kırabilirsin. Sonsuz dongu break; ile kırılır.

        // Infinite Loop: Sonsuz dongu demektir.

//        for (int i = 1; i<4; i--){
//            System.out.println("Hi");
//        }

        // Sonsuz dongu verir. Artırma azaltma kısmında hata yaparsan "infinite loop sorunsal" i olusur.

//        for (int i = 1; i<4; ){
//             System.out.println("Hi");
//        }

        // Sonsuz dongu verir. Artırma azaltma kısmını yazmazsan  "infinite loop sorunsal" i olusur. Cunku i nin degeri ayni kalir.




    }
}
