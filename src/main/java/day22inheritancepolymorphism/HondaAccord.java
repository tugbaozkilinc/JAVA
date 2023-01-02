package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    /*
      1. Siz class olusturdugunuzda java otomatik olarak size gorunmez bir constructor verir. Cunku java class ın bir kalıp oldugunu
         ve Object olusturmak icin yaratıldıgını ve object olusturmak icin constructor in sart oldugunu bilir.
      2. Javanın otomatik olarak olusturdugu bu gorunmez constructor a "default constructor" denir.
      3. Siz kendiniz herhangi bir constructor olusturdugunuzda java "default constructor" i siler.
      4. Bir class ta birden fazla constructor olabilir. Fakat bu constructor larin parametreleri farklı olmalıdır.
      5. "this" keyword "bu class" anlamındadır. "this.price" demek bu class daki price isimli variable demektir.
         "this.price" syntax i constructor larin icinde kullanilir.
      6. Constructor kullanarak variable lar uzerinde yaptıgınız degisimler sadece object uzerindeki variable larin degerlerini degistirrir. Class taki variable
         degerlerini degistiremez.
    */

    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price = price;
    }
    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
        System.out.println("Honda Accord constructor");
    }

    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }



}
