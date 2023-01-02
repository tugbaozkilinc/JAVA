package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        // Wrapper class yeni bir structure. (Wrapper class lar da non-primitive dir, method icerir.) Bu yeni bir yapilanma. Java primitive lere
        // method lar ekleyerek yeni bir structure olusturdu. Bu yapiya wrapper class denir. Byte, Short, Integer, Long, Float, Double, Boolean, Character

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        // Example 1 : byte data type 'in en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // Example 2 : short, int, long data type larin en buyuk ve en kucuk degerlerini ekrana yazdiriniz.

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Primitive ler nasil wrapper lara cevrilir. (Autoboxing)

        float f1 = 13.99F;
        Float wrapperF1 = f1;

        // Wrapper lar nasil primitive lere cevrilir. (Unboxing)

        Character w1 = 's';
        char primitiveW1 = w1;

        // Note : Autoboxing ve Unboxing java tarafindan otomatik olarak yapilir.


    }
}
