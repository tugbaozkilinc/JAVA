package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
      1. "StringBuilder" Java da bir Class tir. Java da farkli class lar var; Arrays, Scanner, String..
      2. "StringBuilder" String olusturmaya yarar.
      3. String Class varken nicin StringBuilder a ihtiyac duyariz?
         Cunku String Class "Immutable(degismez) Class" dir, ama biz bazen "Mutable(degisken)" String lere ihtiyac duyariz.
         String Builder bize "Mutable" String verir.
      4. "Immutable Class" larda var olan deger degistirilemez. Siz var olan bir degeri degistirmek istediginizde
         i) Memory de yeni bir variable yeni bir degerle olusturulur.
         ii) Eski variable in pointer i yeni variable a dondurulur.
         iii) Eger bir variable i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir.

         "Mutable Class" larda orjinal deger korunmaz.
      5. "String Class" larin immutable yapisi security icin onemlidir.
         Ayni degere sahip birden fazla String oldugunda Java bir tane container olusturur ve ayni degere sahip String lerin bu container i kullanmasini temin eder.
         Bu memory i korumak icin iyidir, ancak container daki degeri bir variable icin degistirdigimizde tum variable larin etkilenmesi tehlikesi vardir.
         Bu tehlikeden kurtulmak icin java String leri immutable yapmistir. Fakat herhangi bir variable in degerini degistirmek icin java bir yol bulmustur.
         Degistirmek istediginiz variable icin yeni bir container olusturur ve variable in pointer ini bu yeni variable a yonlendirir. Boylelikle hem degisim saglanmis
         hem de digerleri etkilenmemis olur.
    */

    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java"; // Bu kodu yazdigimizda java iki sey yapiyor; 1. Yeni bir kap olusturup icine Super Java koyuyor. 2. pointer(ok) i kiriyor
                            // ve ayni adresten yeni kaba pointer yolluyor. O yuzden javaya str yi yazdir dedigimizde java Stack memory e gidiyor,
                            // adresi buluyor, adresten yola cikinca 1. pointer kirildigi icin 2. pointer dan yeni degere gidiyor. Yani eski deger hic degismiyor.
                            // Java yeni bir container yeni bir deger olusturup pointer in yeni degeri gostermesini sagliyor. Bu String in yapisi.
                            // Bu yapinin avantaji da dezavantaji da var. Memory de surekli yeni bir container olusturuluyor. Avantaji ise orjinal deger korunuyor.
        System.out.println(str); // Super Java

        StringBuilder strb = new StringBuilder("Java");
        strb = new StringBuilder("Super Java"); // Bu kodu yazdigimizda yani StringBuilder i degistirmek istedigimizde java yeni bir container olusturmaz direk
                                                // container daki Java yi siler ve icine Super Java koyar. StringBuilder da var olan String direk degistirilir.
                                                // String de ise String degistirilmez, yeni bir String olusturulur ve yeni olusturulan pointer yeni String i isaret eder.

        // StringBuilder nasil olusturulur?
        // 1. yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1); // Java Note: Bunun iki ihtimali var; String de olabilir, StringBuilder da olabilir. Consol daki gorunumleri tamamiyle aynidir,
                                   // fakat data type lari farklidir.

        // 2. yol:
        StringBuilder strb2 = new StringBuilder();

        // yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2); // Java is easy!!!

        // yol b:
        strb2.append(" Learn").append(" java earn").append(" money.");
        System.out.println(strb2); // Java is easy!!! Learn java earn money.

        // StringBuilder larda character sayisi nasil bulunur?
        StringBuilder strb3 = new StringBuilder(); // Ben bu kodu yazdigimda java memory e gider 16 tane kutu olusturur. Bu kutularin sayisina capacity denir.
                                                   // Yani StringBuilder in icine alabilecegi karakterlerin sayisi capacity dir. Ben StringBuilder a "Cat" ekledigimde en bastan baslar
                                                   // ve Cat i koyar. Cat den sonra kullanabilecegim 13 kutu kalir. Bu StringBuilder in length i 3 capacity sayisi ise 16 dir.
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx"); // 13 tane bos kutum kalmisti. Ben 15 tane x ekledim. Bosta kalan 13 kutuya java 13 tane x i koydu. Ama koymam gereken 2 tane daha x var.
                                         // Java bunun icin bir tane daha 16 lik bos bir kutu verir. Bunlarin icine en bastan baslayarak kalan 2 tane x i koyar. 2 tane de extra
                                         // kutu verir. Yani capacity 34 olur.
                                         // Note: capacity asimlarinda capacity var olanin 2 katinin 2 fazlasina cikar.
        int numOfChar = strb3.length();
        System.out.println(numOfChar); // 18

        int capacity1 = strb3.capacity();
        System.out.println(capacity1); // 34 ==> 16*2 + 2

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2); // 70 ==> 34*2 + 2

        // setCharAt(2, 'r'); index 2 deki character i 'r' ye cevirir.
        System.out.println(strb3);
        strb3.setCharAt(2, 'r');
        System.out.println(strb3); // Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmm

        // delete(3, 18); index 3(inclusive) ten index 18(exclusive) e kadar tum character lari siler.
        strb3.delete(3, 18);
        System.out.println(strb3); // Carmmmmmmmmmmmmmmmmmmmmmmmmmm

        // deleteCharAt(2); index 2 deki character i siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        // reverse() method u StringBuilder i ters cevirir.
        strb3.reverse(); // Burda sadece method kullandim orjinal deger degisti. Burda strb3 container in icinde "Cammm..m" vardi. Ben javaya ters cevir dedigimde bu StringBuilder oldugu
                         // icin java direk orjinal degeri ters cevirerek degistirdi. Yazdirdigimda ise degisen degeri gordum.
        System.out.println(strb3); // mmmmmmmmmmmmmmmmmmmmmmmmmmaC

        String abc = "Java";
        abc.replace("a", "i"); // Burda ise sadece method kullandim ama orjinal deger degismedi. Iste bu mutable olma ile immutable olma arasindaki farktir.
                                               // Burda abc container in icinde "Java" vardi. Ben replace dedigimde java yeni bir container olusturdu ve onun icine "Jivi" yazdi.
                                               // Burda orjinal degeri gosteren bir ok vardi. Bu ok hala bu orjinal degeri gosterdigi icin biz abc yi yazdirdigimizda "Java" yazar.
                                               // Eger consol da "Jivi" gormek istiyorsam  abc = abc.replace("a", "i"); yazmaliyim yani atama yapmaliyim. Bu da java oku kir ve
                                               // icinde "Jivi" olan container i goster demek oluyor. Orjinal deger asla degismez ve abc container in icinde "Java" hala durur.
        System.out.println(abc); // Java
        // Note: "Mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir. "Immutable" larda orjinal degeri degistirmek icin methodu kullanmak
        // yeterli olmaz, bir de atama islemi yapmak gerekir.

        // toString() methodu StringBuilder lari String e cevirir.
        String stringStrb3 = strb3.toString(); // Bu cevirme isleminden sonra String oldugu icin String in icine koyduk.
        System.out.println(stringStrb3);

        // String den de StringBuilder a asagidaki gibi donulebilir.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        // insert(3, "XXXX"); 3. character den sonra "XXXX" leri koyar.
        strb4.insert(3, "XXXX"); // offset: bosver, insert: arasina koy
        System.out.println(strb4); // mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmaC

        // insert(3, "KLMOPQRSTU", 5, 8); 3. character dan sonra "KLMOPQRSTU" String inin index 5, 6, 7 deki character leri yerlestirir.
        strb4.insert(3, "KLMOPQRSTU", 5, 8);
        System.out.println(strb4); // mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmaC

        // a.compareTo(b); methodu i) StringBuilder lar tamamiyle ayni ise 0 verir.
        //                         ii) a alfabetik sirada b den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir.
        //                         iii) a alfabetik sirada b den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.
        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");
        int sonuc = a.compareTo(b);
        System.out.println(sonuc); // 0 Alfabetik siraya gore farkini verir



    }
}
