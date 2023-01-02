package day21accessmodifiersinheritance;

public class Student {

    /*
      Access Modifiers
      1. public  2. protected  3. default(package private) 4. private
      Note: Access modifier lari genisden dara dogru sayiniz. public>protected>default>private
      Note: Access modifier lari birer birer acıklayiniz.
            public olanlar her class tan kullanilabilir.
            protected olanlar baska package lardan kullanilamaz ancak baska package da child class icinden kullanilabilir.
            default olanlar baska package den kullanilamazlar
            private olanlar sadece olusturulduklari class icinde kullanilabilirler
      Note: "protected" ile "default" un farki
            protected olanlar baska package lardan kullanilamaz ancak baska package da child class icinden kullanilabilir.
            default olanlar baska package den kullanilamazlar
      Note: Class lar icin hangi access modifier lar kullanilabilir
            public, default kullanilir ama protected ve private kullanilamaz.
      Note: Neden protected class larda kullanilamaz?
            Class lar obje olusturmak icindir, obje olusturmak istedigimizde ya projenin her yerinden ulasmamiz gerekir ya da package in icinden ulasmamiz gerekir.
            %90 class lar public olur. Class in public olmasi durumuyla projenin her yerinden obje uretebiliriz. Cok ozel durumlarda projenin her yerinden ulasmayalim
            diye access modifier i default yapariz boylece, o class a sadece package in icinden ulasabiliriz. Obje olusturma projenin her yerinden gerekir. Cunku class
            olusturdugumuzda o class taki kodlari kullanmak isteriz.
    */

    // public her class tan kullanilabilir.
    public String stdName = "TomHanks";

    // protected olanlar baska package lerden kullanilamaz ancak baska package de "child class" icinden kullanilabilir.
    protected String address = "Miami";

    // default olanlar baska package den kullanilamazlar.
    String email = "th@gmail.com";

    // private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private String stdId = "20206517004";


}
