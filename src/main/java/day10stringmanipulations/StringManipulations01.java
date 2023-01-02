package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";
        boolean b = a.startsWith("kola",5);
        System.out.println(b); // true

        String c = a.replaceFirst("a","*");  // a.replaceFirst("a","*"); String deki ilk "a" yi "*" e cevirir. String return eder.
        System.out.println(c); // J*va kolaydir.

        String d = a.concat(" Anladin mi?"); // Note: Java bir konuyla alakali method olusturmussa onu kullaniriz (best practice). concat() varken "+" kullanilmaz.
        System.out.println(d);

        String e = "   Tom Hanks    ";
        e = e.trim();
        System.out.println(e);

        String h = "Java";
        String i = "java";
        int k = h.compareTo(i);
        System.out.println(k); // -32 ==> 97-65=32 ascii deger farki var (buyuk ve kucuk harf arasinda). integer dondurur.
        // compareTo() methodu iki tane String i alfabetik(lexicographic) olarak karsilastirir. Buyuk kucuk harfe duyarlidir. Buyuk kucuk harfe duyarli olmasini
        // istemezsen compareToIgnoreCase() kullanabilirsin. h.compareTo(i); bu kodda h nin alfabetik sirasindan i nin alfabetik sirasi cikarilir.
        // String h = "Java";
        // String i = "Java"; ==>  h.compareTo(i); ==> 0 (Aralarinda alfabetik sira farki yok)
        // String h = "Java";
        // String i = "Kava"; ==>  h.compareTo(i); ==> -1
        // String h = "Java";
        // String i = "Lava"; ==>  h.compareTo(i); ==> -2
        // String h = "Java";
        // String i = "java"; ==>  h.compareToIgnoreCase(i); ==> 0
        // String h = "Jbva";
        // String i = "Java"; ==>  h.compareTo(i); ==> 1

        String n = a.repeat(3); // a.repeat(3) kodu a String ini yan yana 3 kere yapistirir. String dondurur.
        System.out.println(n); // Java kolaydir.Java kolaydir.Java kolaydir.
        // Note: "Java document" a ulasmak icin yani methodun icine girmek icin ctrl basili tut mouse ile methodun ustune tikla.
        // a.repeat(0) empty String return eder.
        // a.repeat(-5) negative deger yazarsan CTE verir ve count is negative: -5 yazar.
        // a.repeat(1) ise o String i return eder.



    }
}
