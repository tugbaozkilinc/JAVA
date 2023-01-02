package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    /*
      Method overloading (overload: asiri yukleme) nasıl yapılır? (Burda add methodunu overloading yaptik)
      1-Method isimleri aynı olmalıdır.
      2-Method parametreleri farklı olmalıdır;
        i) parametre sayılarını degistirebilirsin.
        ii) parametrelerin data tiplerini degistirebilirsiniz.
        iii) parametrelerin yerlerini degistirebilirsin ancak data type lari farklı ise.
      Note: Methodun ismi ve parametreleri methodun imzasıdır.(Method signature). Method signature disinda ne degistirirseniz degistirin Java o method lari farkli kabul etmez.
    */

    public static void main(String[] args) {

        add(3,5); // Bunun icin 1. methodu calistirir, fakat 1. methodu kapatirsan eger CTE verir. Cunku diger iki methodda da bir tane uyum ve bir tane AW oldugu icin
                        // bu coklu durum icinde java secim yapamaz.
        add(3,5.0);

    }
    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public static void add(int a, double b){
        System.out.println(a + b);
    }
    public static void add(double a, int b){
        System.out.println(a + b);
    }


}
