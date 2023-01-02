package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
      1. HashTable bir map tir.
      2. HashTable entrySet leri herhangi bir siralamaya tabi tutmaz.
      3. HashTable HashMap lerden daha yavastir. Cunku HashTable lar thread-safe ve synchronized dir. (Tek bir is icin bu durum boyleyken coklu is ler soz konusu oldugunda
         HashTable HashMap ten daha hizlidir.)
      4. HashTable larda key null olamaz. Key i null yaparsaniz NullPointerException atar.
      5. HashTable larda value null olamaz. Value yu null yaparsaniz NullPointerException atar.

      Note: toString() method u object leri console'da detayları ile görebilmek için class ların içinde oluşturulur.
            toString() method unu oluşturmadan object i console a yazdırırsanız Java o object in adresini yazdırır.
    */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations); // {USA=400000000, Germany=83000000, Turkey=90000000}

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));
        myStudents.put("Science", new Students("Mary Star", "ms@gmail.com", 32, false)); // Burda kendi olusturdugum obje yi Hashtable a value olarak koydum.
                                                                                                                // Bu value yu da toString() method u yazdirir. Bu method u kaldirirsan
                                                                                                                // sana data yi degil hash code u verir.
        System.out.println(myStudents); // {Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}, Science=Students{name='Mary Star', email='ms@gmail.com', age=32, success=false}}

        String name = myStudents.get("Math").name;
        System.out.println(name); // Tom Hanks

        int age = myStudents.get("Math").age;
        System.out.println(age); // 21

        // Non-primitive lerin hepsi bir obje dir;
        // Bizim olusturdugumuz Class tan obje new Students("Tom Hanks", "th@gmail.com", 21, true) seklinde olusuyor.
        // Integer objesi  400000000 seklinde olusuyor.
        // String objesi "USA" seklinde olusuyor.





    }
}
