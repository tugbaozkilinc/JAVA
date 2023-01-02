package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        // Verilen iki String den birinin karakter sayisinin digerinin kac kati oldugunu veren method u olusturunuz.

        double r1 = compareNumOfCharacters("Java", "xy");
        System.out.println(r1); // Database ile connection kesildi
                                // 2.0

        double r2 = compareNumOfCharacters(null, "xy");
        System.out.println(r2); // length() method u null ile kullanilamaz
                                // Database ile connection kesildi
                                // 0.0
        double r3 = compareNumOfCharacters("Selenium", "");
        System.out.println(r3); // Herhangi bir sayi sifir ile bolunemez
                                // Database ile connection kesildi
                                // 0.0


    }

    public static double compareNumOfCharacters(String s, String t){

        double result = 0;

        try {
            result = s.length()/t.length();
        } catch (NullPointerException e){
            System.out.println("length() method u null ile kullanilamaz");
        } catch (ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        } finally {
            System.out.println("Database ile connection kesildi");
        }
        // Yukaridaki kodun database ile connection kurdugunu farzedelim. Sonuc ne olursa olsun database ile application arasindaki connection i kesmemiz gerekir.
        // Bunu da "finally" ile yapariz. "finally" body sine connection i kesmek icin gerekli kodu yazariz. Bu "finally" kismi 1. 2. 3. senaryolarda yani her durumda calistirilir.

        return result;

    }

    // Note: Gunluk hayatta her sart altinda yapilmasi gereken fiiller(arabanin kapisini, telefonu, evin kapisini kapatmamiz gerektigi gibi...) oldugu gibi coding de de bu durum vardir.
    // Application imiz database imiz ile her zaman etkilesim icerisindedir. Application i calistirdigimiz da, application database e girer ve database in icinde birseyler yapar sonra
    // database in icindeki sonuca gore application in ne yapacagina karar verilir. Mesela application a pwd girdiniz, gecerli pwd database de tutulur. Application bizim girdigimiz
    // pwd u alir database e gider database deki orjinal pwd ile eslesip eslesmedigini kontrol eder. Eslesirse sizi homepage e alir, eslesmezse bu pwd gecersizdir der.
    // Son yıllarda hemen hemen butun application lar cloud da calisir. Yani ornegimizdeki database cloud dadir. Application cloud a gidip database ile etkilesime gectiginde bu cloud un
    // firmasi ucret talep eder. En meshurlari AWS dir. Bu parayi saniye basina charge ederler. Baglantida oldugunuz her saniye para oduyorsunuz. Bu yuzden alelacele isinizi bitirip
    // bu baglantiyi koparmaniz gerekmektedir. Happy senario: pwd eslesti, bu durumda baglantiyi koparmamiz gerekir. Negatif senario: pwd eslesmedi, bu durumda baglantiyi yine koparmamiz
    // gerekir. Her halukarda benim database ile isim bittikten sonra connection i kesmem gerekmektedir. Ayni telefon gorusmem bittiginde telefonu kapatmam gerektigi gibi...
    // Aksi taktirde cok masrafli olacaktir.

    /*
       "final", "finally", "finalize" aciklayiniz:
       1. "final" bir keyword dur. Variable, Class ve Method lar icin kullanilir. ...
       2. "finally" bir code block tur.
          "try-catch" veya sadece "try" ile kullanilir.
          "finally" code block icine yazilan code lar her halukarda calistirilir. (En son satirda kullanilir yoksa CTE verir.)
          Mesela Database ile connection i kesmek her halukarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.
       3. "finalize" bir method dur. Bu method java tarafından data lar imha edilmeden once cagirilir, bu method data lari imha edilecek hale getirir ve daha sonra
          "Garbage Collector" bu data lari imha eder.
          "finalize" method unu developer lar da cagirabilir bu teknik olarak mumkundur ama java kendi bildigini yapar.
       *** Ornegin cocugunuzdan odasindaki copleri toplamasini istediginizde, onun copleri toplayip bir posetin icine koymasi ve posetin agzini baglamasi durumu coding de finalize dir.
           Bizim ise Garbage Collector olarak o copleri container a koyup imha etme durumumuz destroy dur. Cocuk copleri finalize etti diyebiliriz. Cop posetine konulan
           coplerin container a atilmasi Garbage collector tarafindan yapilir. Java finalize edilmemis hicbirseyi imha etmez. finalize i java kendisi yapar. Cunku bu kritik bir istir.
           Java bunu developer a birakmaz.
    */



}
