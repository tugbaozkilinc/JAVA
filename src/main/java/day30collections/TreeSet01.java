package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
      TreeSet tekrarsiz elemanlari alfabetik sira ile veya kucukten buyuge(natural order) dizer.
      Treeset cooook yavas calisir. Kullanmadan once cok iyi dusunmek gerekir.

      Note: Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir, ama TreeSet ler cok yavas calistigi icin biz elemanlari once
      HashSet e depolariz sonra HashSet i TreeSet e cevirerek TreeSet in yavas olma problemini asmis oluruz.
    */

    public static void main(String[] args) {

        // Example 1: 8 tane unique String elemani alfabetik sirada depolayiniz.

        // 1. yol:
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails); // [a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1 - start1);

        // 2. yol: Cok daha iyi bir yontem
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        TreeSet myEmailsSorted = new TreeSet<>(myEmails); // TreeSet<String> myEmailsSorted = new TreeSet<>(myEmails);
        System.out.println(myEmailsSorted);
        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end2 - end1);

        System.out.println(myEmailsSorted.last()); // z@gmail.com
        System.out.println(myEmailsSorted.first()); // a@gmail.com
        System.out.println(myEmailsSorted.size()); // 8





    }

}
