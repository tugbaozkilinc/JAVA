package day32maps;

public class StaticBlocks01 {

    public static double pi;

    static {
        System.out.println("Static block 2");
    }

    // static block lar ihtiyacimiz olan variable larin Class olusturma safhasında elimizde olmasını saglar.
    // static block lar Class icindeki herseyden once calistirilir. "main method" tan ve diger tum method lardan once calistirilir.
    // static block lar icinde sadece "static variable" lara deger atanabilir.
    // Birden fazla static block varsa ustteki once calistirilir.

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }



}
