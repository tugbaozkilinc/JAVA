package day28abstraction;

public interface Engine {

    // Interface lerdeki tum method lar abstract olmak zorundadir. (Istisnalari var)
    // Interface lerde abstract method olustururken abstract keyword kullanmaya gerek yoktur, cunku java o method un abstract oldugunu bilir.
    // Interface lerdeki tum method lar java tarafından otomatik olarak public kabul edilir, bu yuzden o method lar icin public yazmaya gerek yoktur.

    // Interface bir cesit to-do list tir. Concrete Class lari interface teki tum method lari implement etmek zorunda birakir.

    void eco();
    void gas();
    void tsi();

    // "default" keyword kullanarak interface lerin icinde body si olan method lar uretebilirsiniz.
    // Bu method lari obje kullanarak cagirabiliriz.
    // Asagidaki method non-static method dur.
    default int add(int a, int b){
        return a+b;
    }

    // "static" keyword kullanarak interface lerin icinde body si olan method lar uretebilirsiniz.
    // Bu method lari inherit ettigimiz Interface ismi ile cagirabiliriz.
    // Asagidaki method static method dur.
    static String update(String str){
        return str + "!";
    }



}
