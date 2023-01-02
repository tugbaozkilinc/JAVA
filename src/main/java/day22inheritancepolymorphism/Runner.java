package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {

        // Note: Data tipi ile class ayni anlamda kullanilir. Her class data tipi dir ama her data tipi class degildir.

        // Inheritance da variable lar secilirken java objenin data type ina bakar.
        // Oncelikle istediginiz variable i object in data type i olan class ta arar.
        // O class ta bulamazsa parent class lara bakar, hicbir parent class da bulamazsa hata verir.

        Cat cat1 = new Cat();
        System.out.println(cat1.a); // 14
        System.out.println(cat1.b); // 34
        System.out.println(cat1.c); // 45

        Mammal cat2 = new Cat();
        System.out.println(cat2.a); // 13

        Animal cat3 = new Cat();
        System.out.println(cat3.a); // 12

        // Object olustururken object in data type i child class lardan secilemez.
        // Inheritance ta method lar secilirken java constructor a bakar.
        // Oncelikle istediginiz methodu constructor i kullanilan class tan alir.
        // O class ta bulamazsa parent class lara bakar, hicbir yerde o methodu bulamazsa hata verir.

        Cat cat4 = new Cat();
        cat4.eat(); // Cat eat
        cat4.drink(); // Mammal drink

        Mammal cat5 = new Mammal();
        cat5.eat(); // Mammal eat

        Animal cat6 = new Animal();
        cat6.eat(); // Animal eat


    }
}
