package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
      1. TreeMap ler entrySet leri key lere gore "natural order" da siralar.
      2. TreeMap ler en yavas map lerdir.
      3. TreeMap ler thread-safe ve synchronised degildir.

      Note: Multiple nulls in values, no null in keys
    */

    public static void main(String[] args) {

        TreeMap<String, Double> salaries = new TreeMap<>();
        salaries.put("Tom Hanks", 3000.00);
        salaries.put("Mary Star", 1000.00);
        salaries.put("Jimmy Johns", 5000.00);
        salaries.put("Kevin John", 5000.00);

        System.out.println(salaries); // {Jimmy Johns=5000.0, Kevin John=5000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        SortedMap<String, Double> map1 = salaries.tailMap("Kevin John");
        System.out.println(map1); // {Kevin John=5000.0, Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String, Double> map2 = salaries.tailMap("Kevin John", false); // Method un icine girerek data type i bulabilirsin, ezberlemek imkansiz.
        System.out.println(map2); // {Mary Star=1000.0, Tom Hanks=3000.0}

        NavigableMap<String, Double> map3 = salaries.subMap("Kevin John", true, "Tom Hanks", false);
        System.out.println(map3); // {Kevin John=5000.0, Mary Star=1000.0}

        Map.Entry<String, Double> map4 = salaries.lowerEntry("Mary Star");
        System.out.println(map4); // Kevin John=5000.0

        Map.Entry<String, Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5); // Mary Star=1000.0

        Map.Entry<String, Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println(map6); // Tom Hanks=3000.0

        Map.Entry<String, Double> map7 = salaries.higherEntry("Tom Hanks");
        System.out.println(map7); // null

        // ceilingEntry() var olan key ile kullanilirsa o key i verir, var olmayan bir key ile kullanilirsa bir sonrakini verir.
        Map.Entry<String, Double> map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8); // Mary Star=1000.0

        Map.Entry<String, Double> map9 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map9); // Tom Hanks=3000.0

        // floorEntry() var olan key ile kullanilirsa o key i verir, var olmayan bir key ile kullanilirsa bir oncekini verir.
        Map.Entry<String, Double> map10 =salaries.floorEntry("Mary Star");
        System.out.println(map10); // Mary Star=1000.0

        Map.Entry<String, Double> map11 =salaries.floorEntry("Paris Hilton");
        System.out.println(map11); // Mary Star=1000.0







    }
}
