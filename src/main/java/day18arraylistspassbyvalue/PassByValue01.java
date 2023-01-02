package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
      1. Java variable larin orjinal degerlerini korumak ister.
      2. Variable methodlar icinde kullanildiginda java method un icine orjinal degeri koymaz, o degerin kopyasini uretir ve method a o kopyayi yollar,
         method kopya ustunde degisiklik yapar dolayısıyla variable in orjinal degeri korunmus olur. Bu sisteme Pass by value(degerini yolla) denir.
         Note: Java Pass By Value kullanir. Bazı programlama dilleri orjinal degeri koruma altina almamistir. Bu isi developer lara bırakmistir.
         Bu tarz diller pass by reference kullanir. Pass by Reference ne demek; pass by reference kullanan diller soyle calisir; reference in kopyasini olusturur,
         sonra bu kopyayi methodun icine yollar. Fakat bunun bir anlami yok orjinal adres de kopya olan adres de seni ayni yere goturur. Reference in kopyasindan gidip
         degeri degistirirsen orjinal degeri degistirmis olursun.
         Java bunu yapmiyor; "Pass by value" kullanir, "Pass by reference" kullanmaz.
     */

    public static void main(String[] args) {

        // Note: Gomlek = 100TL, Ogrenci = -10TL ==> 90TL, Gazi = -20TL ==> 80TL ;
        // Burda orjinal fiyat degismedi, eger ogrenciye indirim yaptigimizda orjinal fiyati degistirirsek bu problem olur, gaziye uygulayacagimiz fiyat 70TL olur.
        // 20TL indirim yaptigini sanirsin ama 30TL indirim yapmis olursun. O yuzden biz bazi islemleri yaparken orjinal degeri korumaliyiz. O yuzden java orjinal degeri koruma
        // ustune kurulmustur. Bizim orjinal degeri degistirmemize cok musaade etmez. Buna default ayar(var olan ayar) diyoruz. Tabii ki israr edersek degistirebiliriz.
        // Orjinal degeri degistirirsen eger sonraki islemlerde beklenmedik hatalar olur. Java pass by value ile bunun onune gecmek istemis.
        // Genelde main methodu ustte tutariz, methodlari altina yazariz.
        // void ; bu method herhangi bir data uretmeyecek, sadece ekrana birsey yazacak ve hicbirsey uretmeyecek sadece aksiyon yapacak demektir. Orn; main method
        // data uretmez o yuzden return type i void dir. Main method motor gibi programinizi calistirir o kadar.
        // Bir method static ise onun icindeki hersey static olmalidir.

        int x = 5;
        System.out.println(x); // 5
        change(x); // 15 ; java burda orjinal degeri korumak istedigi icin orjinal 5 in kopyasini olusturuyor, biz javaya bu 5 i 3 katina cikar dedigimizde
                   // orjinal degeri koruyor ve kopyayi 3 katina cikariyor ve bunu ekrana yazdiriyor. Ama bu 15 orjinal 5 in degismis hali degil kopyanin degismis hali.
        System.out.println(x); // 5
        int ucret = 100;
        ucret = indirim(ucret); // Burda orjinal degeri degistiriyorum; bu da javanin esnekligi.
        System.out.println(ucret); // 90

    }
    public static void change(int a){
        System.out.println(a * 3);
    }

    public static int indirim(int gomlekUcreti) { return gomlekUcreti - 10; }

    // Note: void olunca data vermiyor ya o yuzden return demiyoruz yani ver demiyoruz, fakat alttakinde int dedik yani kullaniciya integer verecek diyoruz o yuzden
    // javaya islemi yaptiktan sonra kullaniciya o sonucu ver anlaminda return diyoruz.



}
