package day28abstraction;

public class Civic implements Engine, Ac, Hood{

    // Note: Yukaridaki statement kirmizi oldugunda Implement methods i tiklarsan eger otomatik olarak abstract method lari override eder.

    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");
    }

    @Override
    public void digital() {
        System.out.println("Uses digital AC");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");
    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }


    // 1. Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu bu ise Java'da mumkun degildir.
    //    Cunku Java "multiple Inheritance" i desteklemez. "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturmustur,
    //    bu yapida "multiple inheritance" a musaade etmistir.
    // 2. Bir class i bir interface in child i yapmak icin "implements" keyword kullaniriz.
    // 3. Interface lerdeki tum method lar abstract oldugu icin interface lere "fully abstraction" denir. Abstract Class larda abstract method ve concrete method bir arada kullanildigi
    //    icin abstract class lara "fully abstraction denmez".



}
