package day25exception;

public class E01 {

    // Note: Hersey olmasi gerektigi gibi; no exception. Sorun var ama halledilebilir; no exception. Sorun var ve halledilemez; throw exception
    // Bir program calistirildiginda, java cozemedigi bir sorunla karsilastiginda calismayi durdurur(stops execution) ve throws an exception(istisna, olagandisilik).

    /*
      1. Exception javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
      2. Exception lar ile calismanin iki yolu vardir;
         i) try-catch block kullanarak exception olussa bile calismayi devam ettirme. Note: Genelde try-catch kullanilir.
         ii) throw exception kullanarak calismayi durdurma. Mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamız gerekiyor ise
         ve o dosya silinmis ise java dosyayı bulamayacaktir, bu yuzden uygulamanın devam etmesi gerekmeyecektir.
      3. Eger exception i handle etmez isek java calismayi durdurur.
      4. try-catch kullanırken try kodunu bir ya da birden fazla catch ile birlikte kullanabiliriz.
      5. try, catch olmaksızın yalnız kullanılamaz. (catch de try olmaksizin yalniz kullanilamaz)
      6. Eger yazmıs oldugunuz herhangi bir kod satirinda problem olabilecegini dusunuyorsanız o kodu try-catch block icine koymalısınız.
      7. catch block parantezi icerisine olması muhtemel exception class ismi yazılır.
      8. e.getMessage() methodunu kullanarak teknik mesajlar elde edebiliriz. System.out.println(); burada yazmis oldugum aciklamalar benim teknik olmayan mesajlarimdir.
         e.printStackTrace(); method u exception ile ilgili detayli teknik mesaj verir. (Hata mesajini consol da gorunce calismayi durdurdugunu sanma,
         kod calismaya devam eder, sadece hata mesajini consol da gosterir.)
         System.err.println(); hata mesajini renkli verir. Bunun sebebi hata mesajlarini diger mesaj lardan ayirt etme istegimizdir.
      9. Eger try body icindeki kod sorunsuz calisirsa catch block devreye girmez.
    */

    public static void main(String[] args) {
        divide(6, 2); // 3
        divide(0, 2); // 0
        divide(6, 0); // Matematiksel olarak mumkun olmadigi icin java throws an exception.
                            // Exception in thread "main" java.lang.ArithmeticException Create breakpoint: / by zero
                            // at day25exception.E01.divide(E01.java:12) / problemin basladigi yer. E01.java:12 tiklarsan seni hataya goturur.
                            // at day25exception.E01.main(E01.java:8) / problemin devam ettigi ve bittigi yer. E01.java:8 tiklarsan seni hataya goturur.

        divide2(5, 0);

    }

    // 1.Yol: Bu cozum yolu exception bünyesinde tavsiye edilmez; cunku bir java kullanicisinin tum matematik kurallarını ezbere bilmesi zorunlu ve mumkun degildir.
    public static void divide(int a, int b) {

        if (b == 0) {
            System.out.println("Bir sayi 0 ile bolunemez");
        } else
            System.out.println(a/b);
    }

    // 2.Yol: try-catch kullanarak exception i handle etmek tavsiye edilir.
    // Java math ile ilgili muhtemel tum istisnalari, hatalari "ArithmeticException" class ina koymustur.
    public static void divide2(int a, int b) {

        try {                                                                            // try{
            System.out.println(a/b);                                                     // once problem aldigi kodu deneyecek, yapamazsa burda yurutmeyi durduracak ve hata firlatacak(ArithmeticException)
        } catch (ArithmeticException e) {                                                // }catch (){ firlatacagi exception i catch yapacak
            System.out.println("Bolme isleminde bir problem olustu: " + e.getMessage()); // burdaki kod calisacak
            e.printStackTrace();                                                         // }
            System.err.println("Bolme isleminde bir problem olustu"); // Renkli message verir. Bunun sebebi hata mesajlarini diger mesaj lardan ayirt etme istegimizdir.
        }
    }

    // Note: Amac kodun calismaya devam etmesini saglamak, hatayi cozmek degil.




}