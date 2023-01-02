package day15arraysmultidimensionalarrays;

public class Arrays03 {

    public static void main(String[] args) {

        // Example 1: Bir String deki sesli harflerin sayisini bulan kodu yaziniz.

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str = str.toLowerCase();
        String[] letters = str.split("");
        int counter = 0;

        // Note: 3 ten fazla durum varsa switch tercih edilir. split() methodu her zaman Array verir.

        for (String w : letters){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }

        System.out.println(counter);



    }
}
