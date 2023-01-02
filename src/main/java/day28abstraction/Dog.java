package day28abstraction;

public class Dog extends Mammal{

    @Override
    public void eat() { // Override edilmis bu method ta "abstract" yazmaz.
        System.out.println("Dogs eat");
    }

    @Override
    public void move() {
        System.out.println("Dogs move");
    }

}
