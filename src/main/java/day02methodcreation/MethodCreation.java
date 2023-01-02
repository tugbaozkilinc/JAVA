package day02methodcreation;

public class MethodCreation {

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2, 5));
        System.out.println(ucSayiyiCarp(2, 1.5, 6));
        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));

    }
    // Method lar aksiyondur, normalde aksiyon data uretir javada. Aksiyon data uretiyorsa urettigi datayi yaz. Ama bazi istisnai aksiyonlar var hicbirsey uretmezler;
    // Ekrana birsey yazdirmak gibi bir tusa tiklamak gibi. Bunlar size yeni data vermez o zaman return type i void yapacaksin.
    // void : Bu method yeni bir data uretmiyor demektir. Ornegin: ekrana birsey yazdirma methodu, bir tusa tiklama methodu gibi.
    // Method lar aksiyondur aksiyonlarin ismi de aksiyon olmalidir. (toplamaYap...)
    // Main method icinde kullanacaginiz hersey static olmalidir.

    // Example 1: Toplama islemi yapan bir method olusturunuz.
    public static double toplamaYap(double a, double b){
        return a+b;
    }

    // Example 2: Uc sayiyi birbiriyle carpan bir method olusturunuz.
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }

    // Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup sonucu ekrana yazdiriniz.
    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
        return (a + b) * c;
    }

}
