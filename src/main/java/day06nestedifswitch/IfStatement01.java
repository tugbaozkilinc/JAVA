package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // Example 1: Type a code, get age from user and decide which stage it's on.
        //         0 - 4 => baby
        //         5 - 12 => child
        //         13 - 20 => teenager
        //         21 - 30 => adult
        //         else (not expected age)

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte(); // byte araligi disindaki hersey icin hata verir.

        // Kod yazmaya baslamadan once senaryoyu cok iyi anlamali tum ihtimalleri dusunmelisin. 0 ve sonrasi gorevin icinde tanimlanmis. Senaryolarda bosluk olursa
        // hemen PO (Product Owner) a sormali ve tavsiyesini almalisin. Burda senaryosu tanimlanmayan negatif durum icin sormali ve o dogrultuda hareket etmelisin.
        // Kod yazmaya orta araliktan baslama. Ya buyukten kucuge git ya da kucukten buyuge. Bu sorunun mantigina gore degisir. Hata mesajinin nasil olacagi
        // developer in onune gelir. Requirement document da vardir. Kodu test ederken kritik degerler mutlaka kullanilmali bir de bu kritik degerlerin oncesinde
        // ve sonrasinda test edilmelidir. -1, (0), 2, (4), (5), 6, (12), (13), 14, (20), (21), 22, (30), 32 Bu tarz teste Boundary(sınır) Value Analyze Test denir. (BVA)
        // Bu kod en az 14 degerle test edilmeli. Developer yarim saatte kod yazar tester da yarim saat de test eder.
        // age<=4 den ise age<5 tercihimizdir.

        if (age<0){
            System.out.println("Gecerli yas giriniz.");
        } else if (age<5){
            System.out.println("Bebek");
        } else if (age<13){
            System.out.println("Cocuk");
        } else if (age<21){
            System.out.println("Genc");
        } else if (age<31){
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis evre");
        }



    }
}
