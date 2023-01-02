package day03typecastingwrapperscanner;

public class TypeCasting01 {


    // Type casting : Bir numeric data type i diger numeric data type a cevirmek demektir.
    // Numeric data types : byte < short < int < long < float < double
    // Kucukten buyuge gidise Auto Widening denir. Buyukten kucuge gidise Explicit Narrowing denir.

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int) population;

        // Example 1: short u double a ceviren kodu yaziniz. Float i byte yapan kodu yaziniz.
        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;
        float price = 12.99F;
        byte newPrice = (byte) price;

        System.out.println(newPrice); // 12 : Java ondalik sayiyi tamsayiya cevirirken yuvarlama yapmaz, ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte) number;
        System.out.println(newNumber); // 3 : -128 + 0 + 127 = 256      515 % 256 = 3

        int num = 510;
        byte newNum = (byte) num;
        System.out.println(newNum); // -2 : 510 % 256 = 254    510 % 256 (2 tane var dedi) = -2      254 denk -2 (mod 256)




    }

}
