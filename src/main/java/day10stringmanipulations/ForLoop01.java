package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1: 4 den 7 ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz.

        for (int i = 4; i<8; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // Example 2: 14 den 5 e kadar tum tamsayilari ekrana yazdiriniz.

        for (int i = 14; i>4; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        // Example 3: 14 den 5 e kadar tum cift sayilari yazdiriniz.

        for (int i = 14; i>4; i--){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Example 4: 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 28; i<158; i++){
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Example 5: "Java" String ini "J*a*v*a*" String ine ceviren kodu yaziniz.

        String s = "Java";

        for (int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();

        // Example 6: Size verilen String deki tekrarsiz karakterleri ekrana yazdiriniz.

        String str = "Hellooo Ali";
        char ch;

        for (int i = 0; i<str.length(); i++){
            ch = str.charAt(i); // Bunu indexOf()-lastIndexOf() parantez icleri ve sout ici dahil uc kez yazmamak icin buraya bir kez yaziyorum.
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }



    }
}
