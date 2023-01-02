package day26exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        double d = divideStringByTheNumOfTheChar("124");
        System.out.println(d); // 41.0
        double d1 = divideStringByTheNumOfTheChar(null);
        System.out.println(d1); // null
                                // 0.0
        double d2 = divideStringByTheNumOfTheChar("");
        System.out.println(d2); // For input string: ""
                                // 0.0
        divideStringByTheNumOfTheCharacter(null); // null


    }

    // String deki character sayisini bulunuz, String i Integer a ceviriniz, Integer i character sayisina bolunuz.

    // 1. yol:
    public static double divideStringByTheNumOfTheChar(String str){

        int length = 0;
        int i = 0;
        double result = 0;
        try {
            length = str.length(); // NullPointerException
            i = Integer.valueOf(str); // NumberFormatException
            result = i/length; // ArithmeticException
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        // Multiple catch kullanildiginda siranin bir onemi yoktur. Siranin onemli oldugu durum 3. yol da anlatilmistir.
        // Ayni anda birden fazla exception atilamaz mumkun degil, cunku bir exception atildiginda java calismayi durdurur, try body deki diger kod lar calismayacagi icin
        // baska exceptionlar olusmayacaktir. Soyle dusun; arabanin lastigi patladi, biraz gitsem gaz da bitse diyemem. Cunku lastik patladigi icin
        // devam etme durumum soz konusu degildir. When you get exception, java stops execution.
        return result;
    }

    // 2. yol:
    public static double divideStringByTheNumOfTheCharacter(String str){

        int length = 0;
        int i = 0;
        double result = 0;
        try {
            length = str.length();
            i = Integer.valueOf(str);
            result = i/length;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        // Bunu soyle dusun; lastigin mi patladi 911 i ara, benzinin mi bitti 911 i ara, araban mi bozuldu 911 i ara. Exception butun exception lari halleder.
        // Burdaki Exception butun exception larin parent class idir. Bir exception atildiginda Exception bunun hangi exception olduguna karar verir ve o
        // exception daki message i yazdirir. Ana merkez gibi dusunebilirsin. Exception i anliyor ve ilgili child a yolluyor.
        // Istersen multiple catch ya da single catch kullanabilirsin. Hangisi daha iyi?
        // Single catch in atomik yapisi guzeldir, multiple catch in ise okunurlugu guzeldir ve multiple catch ile her exception icin ozel uygulama yapma sansimiz vardir.
        return result;
    }

    // 3. yol:
    public static double divideStringByTheNumOfTheCharacters(String str){

        int length = 0;
        int i = 0;
        double result = 0;
        try {
            length = str.length();
            i = Integer.valueOf(str);
            result = i/length;
        } catch (NullPointerException e){ // child class
            System.out.println("NullPointer a ozel...");
        } catch (Exception e){ // parent class
            System.out.println("Diger tum exception lar icin...");
        }
        return result;
    }
    // Note: Eger parent i once child i sonra yazacak olursak child "unreachable code" olur. Cunku ona yakalayacak hicbir exception kalmaz, hepsi parent tarafindan
    // yakalanir. "unreachable code" yazmak her zaman hata verir. Bu sekilde yazmana java da izin vermez, yazdigin an CTE verir.

    /*
      1. Aralarinda "parent-child" relationship olan Exception Class lari multiple catch lerde kulllanmak isterseniz child olan once kullanilmalidir. Aksi taktirde
         hata verir.
      2. Aralarinda "parent-child" relationship olmayan Exception Class lari multiple catch lerde kulllanmak isterseniz sıralamanın bir onemi yoktur.
    */




}
