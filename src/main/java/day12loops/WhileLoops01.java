package day12loops;

public class WhileLoops01 {

    public static void main(String[] args) {

        // Example 1: 3 ten 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz.

        int i = 3;

        while (i<11){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz.

        int k = 17;

        while (k>3){
            if (k%2==0) {
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        // Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz.

        int sum = 0;
        int m = 12;

        while (m<68){
            sum = sum + m;
            m++;
        }

        System.out.println(sum);

        // Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.

        int num = -456;
        num = Math.abs(num);
        int n = num;
        int result = 0;

        while (n>0){
            result = result + n%10;
            n/=10;
        }

        System.out.println(result);

        // Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz.

        int number = 4;
        int p = 1;

        while(p<11) {
            System.out.println(p + " * " + number + " = " + p*number);
            p++;
        }



    }
}
