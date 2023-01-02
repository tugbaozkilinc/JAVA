package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        // Example 1: Anlik tarihi (Current Date) ekrana yazdiran kodu yaziniz.
        LocalDate currentDate = LocalDate.now(); // donusturerek obje urettik. new ile yoktan var ediyoruz.
        System.out.println(currentDate); // 2022-10-21

        // Example 2:  Anlik zamani (Current Time) ekrana yazdiran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); // 20:41:32.502550600

        // Example 3:  Anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // 2022-10-21T20:45:36.287400700

        // Example 4: Japonya daki anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan); // 2022-10-22T02:50:54.907670600

        // Example 5: Istanbul daki anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul); // 2022-10-21T20:52:13.362129700

        // Example 6: Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022,10,21); // dinamik bir code olusturmak icin sabit bir tarih olusturduk. Bugunun tarihini olustursaydik
                                                                              // her gun bu tarih degisecegi icin 789 gun sonrasi da her gun degisecekti.
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate); // 2024-12-18

        // Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);
        Long difference = ChronoUnit.DAYS.between(dobAli, dobVeli); // Chrono unit: zaman birimi, Long yerine long da yazabilirsin ayni sonucu verir.
                                                                    // ChronoUnit bir class
        System.out.println(difference); // 2824, yasi buyuk olani ilk siraya yaziyoruz yoksa sonuc negatif cikar.

        // Example 8: Tom Ali den 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veli den 1 yil 15 gun once dogdu. Tom un dogum tarihi 18 Kasim 2011 ise Veli ve Ali nin dogum tarihlerini bulunuz.
        LocalDate dobTom = LocalDate.of(2011, 11, 18);
        LocalDate dobOfAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);
        System.out.println(dobOfAli); // 2008-03-05
        LocalDate dobOfVeli = dobOfAli.plusYears(1).plusDays(15);
        System.out.println(dobOfVeli); // 2009-03-20

        // Example 9: Istanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız.
        LocalDate istanbul = LocalDate.of(1453,5,29);
        LocalDate republic = LocalDate.of(1923,10,29);
        Long differenceBetweenIsAndRe = ChronoUnit.MONTHS.between(istanbul, republic);
        System.out.println(differenceBetweenIsAndRe); // 5645

        // Example 10: Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1989, 3, 21);
        int day = myDate.getDayOfMonth(); // 21
        int month = myDate.getMonthValue(); // 3
        // System.out.println(myDate.getDayOfYear()); // 341
        // System.out.println(myDate.getDayOfWeek()); // THURSDAY
        // System.out.println(myDate.getMonth()); // DECEMBER
        // System.out.println(myDate.getYear()); // 1989

        // 1. yol:
        if (day>=21 && month==3) {
            System.out.println("Koc");
        } else if (day<=20 && month==4){
            System.out.println("Koc");
        } else if (day>=21 && month==4){
            System.out.println("Boga");
        } else if (day<=20 && month==5){
            System.out.println("Boga");
        }

        // 2. yol:
        if ((day>=21 && month==3) || (day<=20 && month==4)) {
            System.out.println("Koc");
        } else if ((day>=21 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }




    }
}
