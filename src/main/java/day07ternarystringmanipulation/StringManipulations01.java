package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
        String Class Methods:
        1. equals() Iki tane String in ayni olup olmadigini anlamamiza yardim eder. boolean return eder.
        2. equalsIgnoreCase() Iki tane String in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar. boolean return eder.
        3. toLowerCase() Bir String deki tum harfleri kucuk harfe cevirmek icin kullanilir. String return eder.
        4. toUpperCase() Bir String deki tum harfleri buyuk harfe cevirmek icin kullanilir. String return eder.
        5. charAt() Bir String den belli bir index teki karakteri almak icin kullanilir. char return eder.
        6. length() Bir String de kac tane karakter kullanildigini ogrenmek icin kullanilir. int return eder.
        7. contains() Bir String de belli bir karakterin veya karakterlerin var olup olmadigini anlamak icin kullanilir. boolean return eder.
        8. split() methodu Bir String i istedigimiz karakterden parcalamaya yarar. Array return eder.
        */

        // Example 1: Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz;
        // en az 8 karakter icermeli, space karakteri icermemeli, ilk harfi M veya m olmali son karakteri ? olmali.

        String pwd = "Manisa12?";

        boolean first = pwd.length()>7;
        boolean second = !pwd.contains(" ");
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';
        boolean forth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && forth);


    }
}
