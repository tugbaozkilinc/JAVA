package day26exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        // Yasi ekrana yazdiran bir method olusturunuz.

        int age = -25;

        try{
            printAge(age);
        }catch (IllegalArgumentException e){
            System.out.println(e); // java.lang.IllegalArgumentException: Yas negatif olamaz veya 200 den buyuk olamaz.
        }


    }
    public static void printAge(int age){

        if (age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk olamaz."); // Kullanici deger olarak negatif ya da 200 den buyuk bir deger girdiginde ben burdan
                                                                                                 // exception aticam, exception attigimda sonraki kod System.out.println(age);
                                                                                                 // calistirilmayacak. Yani java negatif yasi kabul etmeyecek ve negatif yasla islem
                                                                                                 // yapmayacak. Exception attigim satirdan sonraki hicbir kod calistirilmayacak.
                                                                                                 // try-catch ile handle etmeden kodu calistirdigimizda consol da sunu goruruz;
                                                                                                 // Exception in thread "main" java.lang.IllegalArgumentException: Yas negatif olamaz veya
                                                                                                 // 200 den buyuk olamaz
                                                                                                 // at day26exceptions.Exceptions04.printAge(Exceptions04.java:21)
                                                                                                 // at day26exceptions.Exceptions04.main(Exceptions04.java:9)
                                                                                                 // IllegalArgumentException is an unchecked Java exception and extends
                                                                                                 // the RuntimeException class.
        }
        System.out.println(age);
    }
    // Data yanlissa application durmali. Soyle dusun atm ye gidiyorsun, user name ve password u yanlis giriyorsun. Atm sana yanlis diyor fakat sen isleme
    // devam edip para cekebiliyorsun. Bu yanlis, sen yanlis data girdiginde atm calismayi durdurmali. Eger if else kullanirsan application i durduramazsin.
    // Yanlis data kullanimlarinda meseleyi if else ile cozmeyiz throw exception ve try-catch ile cozeriz.
    // Method olustururken, method icerisinden exception atarim. Bunlar application in trafik isiklaridir.
    // Application i architecture lar dizayn ederler, dizayn ederken de trafik kurallari gibi kurallar koyarlar. Developer lar bu kurallara gore kod yazarlar.
    // Bu kurallari exception lar sayesinde application in icine gomuyoruz. Application da kod yazan developer o kurali bilmese bile hatayi aldiginda
    // meseleyi anlar ve kodunu ona gore yazar.
    // Kurallari exception sayesinde ogrenir, yeni yazacagimiz kodu kurallara gore yazariz.
    // Method un icinde exception uretme durumu hangi senaryolarda kullanilir;
    // Application i architecture lar dizayn ederler, dizayn ederken de kurallar koyarlar. Tabii ki de liste yapmazlar, method larin icine exception koyarlar.
    // Gunluk hayatta yasak olup javada yasak olmayan seyler vardir. Bizim icin yasak olan ve java icin ise yasak olmayan seyler icin exception atmamiz gerekir.
    // Orn: Ilkokul 5. sınıflara daire anlatacagız ve mufredat diyor ki pi sayisi 3 olsun. Developer pi sayisi icin 3 ten farkli bir sayi kullanildiginda
    // exception atar. Exception larin asil varolus sebebi budur.
    // ***IllegalArgumentException bir RuntimeException oldugu icin main method tan cagirildiginda alti kirmizi ile cizilmez ve CompileTimeException lar icin yapilmasi gereken
    // main(String[] args) yaninda throws IllegalArgumentException mesajinin yazilmasina gerek duyulmaz.
    // ***"throws" keyword "checked exception" icin ve exception handle yapilmak istenmiyorsa kullanilir.
    // "throw" keyword kontrollu olarak bir exception throw etmek icin kullanilir. "throw" keyword ile sadece bir exception throw edilebilir.


}
