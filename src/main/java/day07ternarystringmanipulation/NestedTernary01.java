package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        // Example 1: Verilen yilin leap year olup olmadigini kontrol eden kodu yaziniz; yil 100 e bolunurse 400 e de bolunmelidir,
        // yil 100 e bolunmezse 4 e bolunmelidir. (Interview sorusu)

        int year = 1996;
        String result = year%100==0 ? year%400==0 ? "Leap year" : "Not leap year" : year%4==0 ? "Leap year" : "Not leap year";
        System.out.println(result);

        // Example 2: Asagidaki kurallara gore password un gecerli olup olmadigini kontrol eden kodu yaziniz.
        // 8 karakterden fazla veya 8 karakter varsa ilk harfi i olmalidir, 8 karakterden az karakter varsa ilk harfi K olmalidir.

        String pwd = "i2a3ed54"; // happy scenario
        char initial = pwd.charAt(0); // kodun atomik olmasi demek bu.
        String valid = pwd.length()<8 ? initial=='K' ? "Gecerli pwd" : "Gecersiz pwd" : initial=='i' ? "Gecerli pwd" : "Gecersiz pwd";
        System.out.println(valid);




    }
}
