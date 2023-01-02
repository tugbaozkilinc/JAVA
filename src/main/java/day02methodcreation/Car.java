package day02methodcreation;

public class Car {
    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        // Object nasil olusturulur?  new: Yoktan var etmek demek.
        // Class in icinde olan her method(aktif ozellik) ve variable(pasif ozellik) object in icinde de olur.

        Car myHonda = new Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3, 5));

    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder...");
    }
    public void dur(){
        System.out.println("Honda guvenli durur...");
    }


}
