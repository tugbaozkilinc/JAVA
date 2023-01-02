package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        // Example 1: Bir String deki m karakteri haric tum karakterleri yazdiriniz.

        // 1. yol:

        String s = "Andromeda";
        char ch;

        for (int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            if (ch!='m'){
                System.out.print(ch);
            }
        }

        System.out.println();

        // 2. yol:

        for (int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            if (ch=='m'){
                continue;
            }
            System.out.print(ch);
        }

        // Note: continue; loop icinde kullanilir.

        System.out.println();

        // Example 2: 1 den 100 e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz.

        for (int i = 1; i<101; i++){
            if (i%6==0){
               continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        // Example 3: Verilen bir String deki m den onceki karakterleri yazdiriniz.

        String str = "Luxembourg";
        char c;

        for (int i = 0; i<str.length(); i++){
            c = str.charAt(i);
            if (c=='m'){
                break;
            }
            System.out.print(c);
        }



    }
}
