package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("X");
        System.out.println("Constructor 1");
    }

    public Math(int a){
        this(); // Bu Class in icinde diger(parametresiz) Constructor i kullan demek, yani usttekini. Parent class taki constructor i kullanmak icin ise super() kullanırız.
                // Burdaki this() i kaldırırsan java consol a Constructor A, Constructor 2 yazdırır. Gorunmez olan super() dan dolayı.
        System.out.println("Constructor 2");
    }


}
