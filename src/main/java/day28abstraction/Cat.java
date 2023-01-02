package day28abstraction;

public class Cat extends Mammal{

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }

    /*
      Bir method parent class ta abstract method ise child class o methodu override edip kullanmak zorundadir. Bu yuzden herhangi bir fonksiyonu
      child class icin mecburi yapmak isterseniz o methodu abstract yapmalisiniz.
    */


}
