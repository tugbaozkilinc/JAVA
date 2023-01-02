package day01variables;

import org.w3c.dom.ls.LSOutput;

public class Variables01 {

    // Variable nasil olusturulur?
    // 1* Access modifier   2* Data Type   3* Variable ismi   4* =   5* Deger   6* ;
    // Javada ; ingilizcedeki . gibidir..
    // İngilizcede cumle deriz javada statement deriz.
    // = sembolu assignment operator olarak adlandirilir. Bu operator sagdaki degeri alir soldaki variable in icine koyar.
    // Ben instance variable lari olusturdugumda java onlara otomatik olarak 0 default degerini atar. Diger type lar icin de default value atar.
    /*
       Javada Data Type lar;
       Primitive Data Types;
       1* int: 32 bit kulanir. (Matematikde tamsayilarin basi ve sonu yoktur fakat javada vardir. Memory i tasarruflu kullanirsan application hizli calisir ve ucuza mal olur.)
       2* byte: 8 bit kullanir.
       3* short: 16 bit kulanir.
       4* long: 64 bit kullanir.
       5* float: 32 bit kullanir. Virgulden sonra 7 basamak icerir.
       6* double: 64 bit kullanir. Virgulden sonra 16 basamak icerir.
       7* boolean: 1 bit kullanir.
       8* char: 16 bit kullanir.
       byte < short < int < long < float < double
       Non-Primitive Data Types;
       1* String: Bir String olusturdugunuzda java size bir suru method verir.

    */

    public int age = 13;
    public int height = 183;
    public byte price = 12;
    public short populationOfVillage = 23000;
    public float priceOfShirt = 13.99f;
    public double weightOfCell = 0.000012045;
    // Siz long demenize ragmen java verilen sayiyi int kabul eder. Bu yuzden long bir variable a int araliginin disinda bir sayi verirseniz mutlaka sonuna
    // L veya l(1 e benzedigi icin tercih edilmez.) koyunuz.
    public long populationOfWorld = 7000000000L;
    // Burada L koymadigimiz halde problem yok. Cunku 1234 int araligina uyar.
    public long x = 1234;
    public boolean isRich = false;
    public char initial = 'S';
    public String name = "Tom Hanks";

    /*
      Primitive ile non-primitive lerin farki nedir?
      1* Non-primitive data type larinda degerin yaninda method lar vardir. Primitive data type larda ise sadece deger vardir method yoktur.
      2* Primitive data type lari java tarafindan olusturulmustur toplam 8 tanedir. Biz primitive data olusturamayiz.
      Non-primitive ler java tarafindan da olusturulmustur biz de olusturabiliriz. Non- primitive ler sayilamayacak kadar coktur cunku her developer non-primitive data type olusturabilir.
      (Class olusturmak non-primitive data olusturmak demektir. Icinde deger ve method vardir.)
      3* Primitive data type isimleri kucuk harfle baslar, non-primitive data type isimleri ise buyuk harfle baslar. (Nicin buyuk harfle baslar?: non-primitive ler ayni zamanda class tir,
      butun class lar da ayni zamanda non-primitive dir. Class isimleri buyuk harfle baslar.)
      4* Primitive data type lar memory de farkli buyuklukte yerler kullanir. Non-primitive lerin hepsi memory de ayni buyuklukte yer kullanirlar.
    */
    
}
