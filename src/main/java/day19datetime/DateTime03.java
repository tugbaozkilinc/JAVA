package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        // Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz.
        // Note: Burda sadece zaman(LocalTime) ile calisirsan eger sorun yaratabilir, arada gun farki da olabilecegi icin bu yuzden tarih ve zaman(LocalDateTime) ile calismak tavsiye edilir.
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Japan"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long difference = ChronoUnit.HOURS.between(germany, japan); // Buraya once eski tarihi yaziyoruz. Japonyada ayin 22 si fakat Almanyada ayin 21 i. 21 daha eski bir
                                                                    // tarih oldugu icin once Almanya yi yazdik.
        System.out.println(difference);

        // Example 2: Sabit bir tarih olusturunuz.
        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13); // istersen javadan al istersen 4 yaz.
        System.out.println(myDate); // 2011-04-13(Bu javanin tarih formati)

        /*
          Note: Java her application da kullanilan data lari kendi icinde barindirir. Mesela application larda mutlaka ay isimleri kullanilir.
          Java bu yuzden ay isimleri icin depo olusturmustur. Java ay ismi gibi sabit bazi data lar icin kendi icinde depo olusturur ve bu datalari o depolara koyar.
          Biz de javanin bu ozelligini taklit ederiz. Kendi application imizda kullanacagimiz sabit data lar varsa onlar icin bir depo olusturur ve onlari oraya koyariz.
          Onlar icin google a gitmeyiz cunku bizim application imiz stand alone olmali yani kendi basina ayakta durabilmeli. Sabit bir data icin baska yere ihtiyac
          duymamali kendi application imizdan o datayi bulup kullanabilmeliyiz. Javada bu tarz depolara enum denilir.
          1. Javada sabit datalari (Gun isimleri, Ay isimleri, Amerika daki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak icin depolar olustururuz.
             Bu depolara Enum denir.
        */

        // Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Countries country = Countries.USA; // Data type a String yazarsan sikayet eder. Enum olusturup icine data koydugumuzda datanin type i bizim Enum imiz olur String olmaz.

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }





    }
}
