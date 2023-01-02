package day28abstraction;

public abstract class Animal {

    public abstract void eat();

    public void drink(){
        System.out.println("Animals drink");
    }

    public abstract void move();

    /*
      Body si olmayan method lar "abstract method" olarak adlandirilir.
      Bir method u abstract yapmak icin;
      i) Method body i sil
      ii) "abstract" keyword kullan
      "abstract method" lar "abstract class" icinde olmalidir.
      "abstract class" larda hem "abstract" hem de "concrete(non-abstract)" method kullanilabilir.
    */

    // Abstract Class lar Interface lere gore hiz acisindan daha avantajlidir.
    // Abstract Class larin icindeki tum nesnelerin "public" olmasi zorunlu degildir. Interface in icindeki tum nesnelerin "public" olmasi gerekir.
    // "abstract" olmayan "concrete" method lar static olarak tanimlanabilir.



}
