package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
      Set coklu ve unique olan data lari depolamak icin kullanilir.
      Hash bir tekniktir hatta buna hashing technique denir, birbirine benzemeyen(unique) data uretmeye yarar. Std id: 20027317004 --> bu id olusturulurken hashing technique kullanilmistir.
      Java bu islemi kendi icindeki her data icin yapar. Ornegin bir LinkedList olusturdugumuzda java bunun icin hashing technique ile hash(unique) code uretir.
      Java her data ya ozel bir code verir. Biz o data yi istedigimizde java once hash code u bulur sonra o data ya ulasir. Hash code u bulmadan data ya ulasirsa karisiklik olusur.

      HashSet ler elemanlari eklerken siralama ile ugrasmaz. Sıralama ile alakali zaman harcamaz, bu yuzden cok hizli calisirlar.
      HashSet ler index kullanmaz, cunku siralama rastgele yapilir ve index her calismada farkli bir eleman verir, bu yuzden index kullanmak manali olmaz.
      Fakat biz code yazarken index kullaniriz ki bu java icin index anlamina gelmez cunku java HashSet in index kullanmadigini bilir ve benim index ten ne kastetigimi
      anlar, arka planda kendi sistemini uygular.
      HashSetler ne zaman kullanilir?
          1. unique elemanlarda
          2. sıralama onemli degilse
          3. hız cok önemliyse
    */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange] --> insertion order yapmadi, siralamayi kendi kuralina gore yapti.

        // Note: Var olan elemani eklerseniz hata vermez, son ekleneni var olan data nin ustune yazar. (overwrite)
        emails.add("Mango");
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]
        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails); // [null, Apple, Fig, Mango, Apricot, Orange]



    }
}
