package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        // Note: String.valueOf() methodu parantezin icine konulan datanin tipini String yapar.
        // regex icin nokta kullandiginda onune \\ koyunuz. Yani nokta \\. seklinde kullanilir. Noktayi ozel sembol anlamindan kurtarmak icin boyle yapilir.

        double n = 24.5673;
        String s = String.valueOf(n);
        String decimalPart = s.split("\\.")[1];
        int decimalInt = Integer.valueOf(decimalPart);
        int i = decimalInt;
        int sum = 0;

        do {
            sum = sum + i%10;
            i/=10;
        } while (i>0);

        System.out.println(sum);



    }
}
