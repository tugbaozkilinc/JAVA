package day20stringbuilderstringbuffer;

public class StringBuffer01 {

    /*
      1. StringBuffer javada bir class tir ve String olusturmaya yarar.
      2. StringBuffer Class StringBuilder Class gibi mutable dir.

      StringBuffer ile StringBuilder in farki nedir?
      1. StringBuffer thread-safe(guvenli es-zamanli calisma) dir.
      2. StringBuffer synchronized(es zamanli) dir. Bu su demek; multi-thread olabilmek icin mantikli siralama yapmak ve verilen isleri siralama becerisine sahip olmak gerekir.
         Verilen isler zamani kisaltacak sekilde siralanmalidir.
      3. StringBuilder StringBuffer dan hizlidir.
      Note: Java bir isi yaparken bir isi bitirip digerine baslamaz, isleri ust uste yapar. Biz buna multi-thread(coklu is) diyoruz. Bu su demek; java yeni bir ise baslamak
      icin basladigi bir isin bitmesini beklemez. Javada bazi seyler multi-thread calisir, bazi seyler ise multi-thread calismaz. StringBuilder multi-thread calismaz.
      StringBuffer ise multi-thread calisir.

      Senaryolar
      1. Degistirilemez data icin "String Class" kullanilir.
      2. Degistirilebilir ama "multi-thread" gerekmeyen durumlar icin "StringBuilder" kullanilir.
      3. Degistirilebilir ve "multi-thread" gereken durumlar icin "StringBuffer" kullanilir.
    */

    public static void main(String[] args) {



    }
}
