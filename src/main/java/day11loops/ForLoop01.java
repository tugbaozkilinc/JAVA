package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1: 3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz.

        int sum = 0;

        for (int i = 3; i<7; i++){
            sum = sum + i;
        }

        System.out.println("Sum is: " + sum);

        // Example 2: 6 den 3 e kadar tamsayilarin carpimini bulan kodu yaziniz.

        int multiply = 1;

        for (int i = 6; i>2; i--){
            multiply = multiply * i;
        }

        System.out.println("Multiply is: " + multiply);

        // Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz.
        // Note: Javada tamsayiyi tamsayiya bolersen sonuc tamsayi olur.

        int num = -385;
        num = Math.abs(num);
        int result = 0;

        for (int i = num; i>0; i/=10){
            result = result + i%10;
        }

        System.out.println(result);

        // Example 4: Size verilen bir String i ters ceviren kodu yaziniz.

        String s = "Kaba";
        String reverse = "";
        char ch;

        for (int i = s.length()-1; i>-1; i--){
            ch = s.charAt(i);
            reverse = reverse + ch;
        }

        System.out.println(reverse);



    }
}
