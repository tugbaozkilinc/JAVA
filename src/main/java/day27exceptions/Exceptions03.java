package day27exceptions;

public class Exceptions03 {

    /*
       1. Java Exception'lar olusturarak Developer'larin Java kurallarina uymalarini temin etmistir.
       2. Biz de Application uretirken kendi Exception'larimizi olusturarak diger developer'larin bizim ortaya koydugumuz kurallara uymalarini temin ederiz.
       3. Java'nin degil, bizim urettigimiz Exception'lara "Custom Exception" denir.
       4. Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir.
       5. Custom "RunTimeException" uretmek icin "extends RuntimeException" deriz.
       6. Custom "CompileTimeException" uretmek icin "extends Exception" deriz.
    */

    public static void main(String[] args) throws IllegalGradeException {

        printGrades(60); // CTE verir. More actions - Add exception to method signature tikla. main() yanina throws IllegalGradeException yazacaktir.
        boolean isTrue = checkNameFormat("ali");
        System.out.println(isTrue);
    }

    // Ogrenci notlarini yazdiran bir method olusturunuz
    public static void printGrades(double grade) throws IllegalGradeException  {
        if(grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz"); // CTE verir. Kirmizinin ustunde bekle. More actions - Add exception to method signature tikla.
                                                                                  // printGrades() yanina throws IllegalGradeException yazacaktir.
        }else{
            System.out.println(grade);
        }
    }

    // Verilen ismin ilk harfinin buyuk harf olmamasi durumunda Exception atan method u yaziniz.
    public static boolean checkNameFormat(String name){

        if(name.charAt(0)>='A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir"); // Altini cizmiyor RTE oldugu icin
        }

    }
}
