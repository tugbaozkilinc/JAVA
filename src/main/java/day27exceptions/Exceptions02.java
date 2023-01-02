package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
      1. FileInputStream fis = new FileInputStream("src\main\java\day27exceptions\File1.txt");
         "new" den sonraki "FileInputStream" hata verir. Çünkü; biz Java'ya verilen adresteki dosyaya git dedik. Java iki endişeye kapıldı;
         i) Ya adres yanlışsa
         ii) Ya verilen adreste dosya yoksa
         Biz "method isminden" sonra, "throws FileNotFoundException" yazarak Java'ya bu iki endişe duyduğun durum oluşursa "Exception At" dedik.
      2. while ((k = fis.read()) != -1){} yazdığımızda "read()" method'u hata verir. Çünkü biz Java'ya dosyadaki karakterleri oku dedik. Java bir endişeye kapıldı;
         i) Ya okuması gereken karakterler Java'nın bilmediği karakterler ise
         Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karşılaştığında "Exception At" dedik.
      3. Method isminden sonra "throws IOException" yazarsanız Java "throws FileNotFoundException" ı siler. Çünkü;
         "IOException", "FileNotFoundException" ı kapsar. "IOException", "FileNotFoundException" ın parent ıdır, onun yaptığı her şeyi yapabilir, o yüzden
         "IOException" varken "FileNotFoundException" a gerek yoktur.
         "IOException", "Input Output Exception" demektir. IO input ve output ile ilgili butun problemleri halleder. Input yapmak icin dosyaya gidip dosyayi bulmak gerekir,
         bu input un bir basamagidir. Bununla alakali problemi de halleder o yuzden FileNotFound a gerek yoktur. FileNotFound sadece file i bulur.
         Exception atan method lar main icinde kullanildiklarinda mutlaka "throws IOException" yazilmalidir. Bunu yazmazsan hata verir.
         IOException programimizda bir file a input/output yapiliyorsa ve program calisirken bir problem cikarsa olusur. Kod yazilirken mutlaka handle edilmelidir.
      4. Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "run" butonuna basmadan ortaya cikti. Bu tarz Exception'lara
         "Compile Time Exception" denir, diger adlari "Checked Exception" dir.

         "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.
    */

    public static void main(String[] args) throws IOException {

        readTheTextFromTheFile();
        readTheText();

    }

    // Bir text file daki text i okuyan kodu yaziniz.(Burda yazacagim kod olusturdugum file a gidecek ve ordaki yaziyi consol a basacak)
    // 1. yol:
    public static void readTheTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt"); // ("") icine dosyanin adresini girmelisin.
        int k = 0;
        while ((k = fis.read()) != -1){
            System.out.print((char)k);
        }

    }

    /*
      Text file nasil olusturulur; package - sag tik - new - File - name it(File.txt)
      Java bir text i dosyadan okumak icin bir class olusturmustur(FileInputStream). Farkli dosyalardan data almak application da cok sık yapilan bir istir.
      Dosyanin adresi nasil bulunur; dosya - sag tik - Copy Path/Reference - Absolute Path(En bastan en sona kadarki adresi verir) - adress kismina yapistir.
      FileInputStream("address"); adress i yazdigimizda FileInputStream CTE verir. Bunun sebebini soyle aciklayabiliriz; arkadasima benim eve git ve dosyayi oku dedigimde,
      arkadasim soyle dusunecektir ya o dosya orda yoksa, peki ya dosya evde tarif edilen yerde degilse... Java da bu endiseyi tasir. Java ya bu adres teki
      dosyayi oku dedigimde java sunu dusunecektir; ya address yanlissa, ya da address teki dosya imha edilmisse... Benim burda su sekilde devreye girmem lazim; endiselenme java
      address yanlissa ben devreye girecegim, dosya yoksa yine ben devreye girecegim. Bunu soyle yapacagiz; kirmizinin ustunde bekleyip More actions - Add exception to method signature tikla.
      Bunu yaptigimizda methodName() yanina throws FileNotFoundException yazar. Bu su demek java eger address yanlissa beni ara(throws FileNotFoundException), dosyayi bulamazsan
      yine beni ara(throws FileNotFoundException). Biz tum bu islemlerle java ya dosyaya git dedik. Artik dosyayi oku dememiz gerekir.
      int k = 0;
      while ((k = fis.read()) != -1){
           System.out.print((char)k);
      }
      read CTE verir. Bunun sebebi sudur; java cince bir karakterle ya da ascii table da olmayan bir karakterle karsilasinca ne yapmasi gerektigini bilemeyecektir.
      Benim bu durumda java eger boyle bir durumla karsilasirsan beni ara demem gerekir. Kirmizinin ustunde bekle More actions - Add exception to method signature tikla.
      Bu durumda methodName() yaninda yazan throws FileNotFoundException degisecek ve throws IOException yazacaktir. IO, FileNotFound in parent idir. Parent in oldugu yerde
      cocuga soz dusmez.
      fis.read() yazdigimizda java dosyaya gelecek ve bu dosyayi okuyacak. Nasil okur;
      Ilk karakterin(J) ascii degerini alir ve bu degeri k nin icine koyar. Dolayisiyla k = 74 / 74 != -1 bana true verecek / System.out.print((char)k); J yi ekrana yazdiracak.
      Son karakteri de yazdirdiktan sonra okuyacak karakter kalmadigi icin fis.read() -1 verecek ve dongu kirilacaktir.
      Bu methodu main method icinden cagiracagim; readTheTextFromTheFile(); yazdigimda CTE verir. Cunku bu method exception atiyor. Bu exception i halletmemiz gerekir. Kirmizinin
      ustunde bekleyip More actions - Add exception to method signature tikla. main(String[] args) yanina throws IOException koyar. Method tan atilan exception in main method tarafindan da
      atilmasi gerekir.

    */

    // 2. yol:
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt"); // More actions - Surround with try/catch tikla, otomatik kendi yapacaktir.
            int k = 0;
            while ((k = fis.read()) != -1){ // read CTE verir. More actions - Add 'catch' clause(s) tikla. Diger catch i otomatik alta ekler.
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) { // child
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");
        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir character var");
        }
    // Burda olusan exception lari ben handle ettim. Bu sekilde javaya problem olustugunda bagir ya da beni ara demiyorum. Java ya diyorum ki burda problem varsa bunu,
    // burda problem varsa bunu yap diyorum. Hangisi iyidir; o bize verilen goreve baglidir. Eger bize verilen gorev address yanlis oldugunda application hata versin ve dursun derse
    // 1. yolu kullanmaliyiz, ama derse ki address yanlis oldugunda baska bir is yapsin mesela baska bir address e gitsin, o zaman 2. yolu kullanmaliyiz.
    // 2. yol daki method exception atmiyor, o yuzden bu method u main in icinden cagirdigimizda main() in yaninda throws IOException yazmasa da hata vermez. 2. yol da
    // javaya beni ara demedim ona ne yapacagini soyledim. 2. yol daha cok kullanilir.
    }





}
