package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats meow");
    }

    // Parent ta uygulamasini begenmediginiz method un uygulamasini degistirip kullanmaya overriding denir. sag tık generate- override methods- degistirilecek method un ismi

    @Override // Bu su demek; bu method sifirdan olusturulmus bir method degil parent class tan alınmıs bir method demektir. @Override annotation(dip not) ini kullanarak javanın
              // yaptıgımız override islemini kontrol etmesini saglarız. Basinda "@" isareti olanlara annotation diyoruz. Bu isaret cok onemlidir. Senin hata yapip yapmadigini
              // kontrol eder. Burda direk override kullanmadan methodu degistiremezsin o zaman inheritance structure ini bozmus olursun.
              // Yandaki "o" ya tıklarsan overridden yapılan parent class a gidersin.
    public void eat() {
        System.out.println("Cats eat"); // Burda super.eat(); vardi bu parent a git eat() method unu kullan demek, o yuzden sildik kendi body mizi olusturduk.
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Mammal create() { return new Mammal(); }


    /*
      1. Override yaparken methodun body si degisir. Cunku method un implementation ini kullanmak istemedigimiz icin, override da uygulama degistirilir.
      2. Override yaparken asla method signature(isim ve parametre) degistirilemez.
      3. Override yaparken "inheritance" olmak zorundadır. Cunku override yaparken method u parent tan almam gerek, bunun icin de arada parent-child relationship olmalidir.
         Inheritance in olmadigi yerde override dan bahsedilemez.
      4. Override yaparken access modifier lar belli kurallara gore farklılastırılabilirler.
         i) "private" method lar override edilemezler. (private olanlara baska class tan ulasilamaz ki override edilsin)
         ii) Child Class daki override edilen method un access modifier i parent class daki methodun access modifier i ile ayni veya daha genis olmalidir.
             (Baba cocuguna diyor ki Istanbul da gezmek istiyorum, cocuk ise lafi mi olur baba Turkiye de gez diyor. Yani cocuk babayi sinirlandiramaz.)
         Note: Child class taki method un accesss modifier i daha dar olamaz.
         iii) default method lar aynı package icindeyse override edilebilirler, farklı package dan override edilemezler.
      5. Parent class taki method un return type i void ise, return type degistirilemez.
      6. Parent class taki methodun return type i primitive ise, return type degistirilemez.
      7. Parent class taki methodun return type i Wrapper Class ise, return type degistirilemez.
      8. Parent class taki methodun return type i Parent Class ise, overriding method in return type child lardan biri olabilir.
         public Animal create() { return new Animal(); }  ==> parent class taki bu methodu override ederken asagidakileri yapabilirsin; // Overridden
         public Animal create() { return new Mammal(); }  ==> yapabilirsin // Overriding
         public Mammal create() { return new Mammal(); }  ==> yapabilirsin
         public Cat create() { return new Mammal(); }  ==> yapamazsin. (Bu sikayet override ile alakali degil, bu sikayet teknik bir sikayet; ben buyuk kutuyu
         kucuk kutuya koy diyorum; java da koymam diyor. Override problemleri parent class ta da gorulur ama orda hicbir sikayet yok.)
         Override yaparken;
         Note: Child class daki return type parent class dakinden genis olamaz. (es olabilir bir de cocuklari olabilir.)
         Note: Aralarında parent-child iliskisi olmayan class lar overriding de return type degisiminde kullanılamazlar. Cunku overriding de inheritance sarttir.
               Mesela Short Integer dan kucuktur, fakat aralarında parent child iliskisi olmadıgından Integer yerine Short kullanamazsınız.
         Note: Child taki method un return type indan parent daki method un return type ina gidiste "IS-A" relationship olmalı.
         Note: Aralarında "IS-A" relationship olan data type lara "Covariant(es degisken)" denir.
         Note: public Animal create() { return new Animal(); } ==> overridden method denir.
               public Mammal create() { return new Mammal(); } ==> overriding method denir.
      9. Parent-child relationship te asagidan yukari cikarken IS-A her zaman dogrudur, buna IS-A relationship denir. Yukaridan asagiya inerken HAS-A her zaman dogrudur, buna HAS-A relationship denir.
      10. final method lar override edilemezler, cunku overriding de method body degistirilir, fakat final method body nin degistirilmesine musaade etmez.
      11. Polymorphism(coklu yapi) = Overloading + Overriding
          Note: Polymorphisim nedir derlerse; overloading ve overriding i anlatın.
      12. Overloading ile overriding arasındaki farklar nelerdir?
          1. Overloading icin inheritance gerekmez, fakat overriding icin gerekir. (Overloading tek(ayni) bir class in icinde olur, o yuzden parent-child relationship gerekmez.)
          2. "private" method lar overload edilebilir, override edilemezler.
          3. "final" method lar overload edilebilir, override edilemezler.
          4. Overloading static polymorphism, overriding dynamic polymorphism olarak adlandirilir.
             Cunku "static" method lar overload edilebilir, override edilemezler.
          5. Overloading de method signature degisir, overriding de method signature a dokunulmaz.
    */
}
