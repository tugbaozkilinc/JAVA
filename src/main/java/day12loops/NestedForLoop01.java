package day12loops;

public class NestedForLoop01 {

    public static void main(String[] args) {

        // Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz.
        // ****
        // ****
        // ****

        for (int i = 1; i<4; i++){
            for (int k = 1; k<5; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
         Example 2: Asagidaki sekli cizen kodu yaziniz.
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
        */

        for (int i = 1; i<6; i++){
            for (int k = 1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         Example 3: Asagidaki sekli cizen kodu yaziniz.
         * * * *
         * * *
         * *
         *
        */

        int row = 4;

        for (int i = 1; i<=row; i++){
            for (int k = row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
