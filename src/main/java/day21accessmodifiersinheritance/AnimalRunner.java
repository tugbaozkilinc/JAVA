package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
      1. Inheritance sayesinde;
         i) Code tekrarlarından kurtuluruz.
         ii) Code tamiri (maintenance) kolay olur.
         iii) Child Class lari daha atomik yapmis oluruz.
      2. Bir class i baska bir class in child class i yapmak icin;
         "extends" keyword kullanılır. Ilk yazılan class child ikinci yazılan class parent olur.
      3. Child class objeleri parent class tan method ve variable lari kullanabilirler.
      4. Parent class objeleri child class tan method ve variable lari kullanamazlar. (Yukaridan asagiya kullanim yok.)
      5. Object class her class in parent idir.
         Javada Object class haric her class in parent i vardir.
         Javada parent i olmayan tek class Object class tir.
      6. "private" method ve variable lar child class lar tarafından kullanılamaz.
         "protected" method ve variable lar child class lar tarafından kullanılabilir.
         "public" method ve variable lar child class lar tarafından kullanılabilir.
         "default" method ve variable lar ayni package daki child class lar tarafından kullanılabilir.
         Note: Child class lar tarafindan kullanilabilir olmak inherit edilebilir demektir.
      7. 4 tip inheritance vardir;
         i) Multilevel inheritance: java bunu kabul eder. (apartman tipi)
         ii) Hierarchical inheritance: bir parent icin coklu child, java bunu kabul eder.
         iii) Multiple inheritance: bir child class a coklu parent, java bunu desteklemez.
         iv) Single inheritance: bir child class icin bir parent class demektir, java bunu destekler.
    */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();

        // d1. dedigimde eat(), drink() method lari parent class dan ve bark() methodu kendi class indan geldi. Ama burda baska method lar da var; equals(), hashCode(),
        // toString(), getClass(), notify(), notifyAll(), wait(), wait(), wait(). Bu method larin hepsi Object Class tan geliyor. Java da her class in ortak babasi olan
        // Object class vardir. Aslinda Animal extends Object tir, fakat bu yazilmaz. Cunku javada varlıgı kesin olan seyler yazılmaz.


    }
}
