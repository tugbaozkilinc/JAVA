package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        // Example 1 : Sayi pozitif ise ekrana pozitif yazdirin.

        int s = 12;
        if (s>0){
            System.out.println("Positive");
        }

        // Example 2 : Verilen karakter buyuk harf ise ekrana buyuk harf yazdirin.

        char ch = 'A';
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        // Note : && islemi sadece boolean ile kullanilir.

        // Example 3 : Verilen bir sayi 3 basamakli ise ekrana Uc basamakli yazdiriniz. n>99 && n<1000 bunu kullanirsan n>=100 && n<=999 e gore java daha hizli calisir.
        // Cunku Javanin burada daha az kontrol yapmasi gerekecek. Bu is hayatinda onemli bir durum. Kodunla ilgili tavsiye alacaksin. Ne kadar az tavsiye alirsan o kadar
        // basarili bir developer sayilirsin. Kucuk de olsa tavsiye almamaya calis. Yazdigin kodu mutlaka gozden gecir. Yazdigin kodda mutlaka eksik senaryolar,
        // hatali durumlar olabilir.

        int n = -789;
        n = Math.abs(n);

        // Math class ina git abs (absolute value; mutlak deger) methodunu kullan sayinin mutlak degerini al bunu sayiya ata. Bu method bir cok yerde kullanilir.
        // Bu abs methodu negatif sayiyi pozitife cevirir atama operatoru bu sayiyi n nin icine koyar. "=" isareti atama operatorudur matematikteki esittir anlamina gelmez
        // "==" isareti matematikteki esittir sembolu anlamindadir.

        if (n>99 && n<1000){
            System.out.println("Uc basamakli");
        }

        // Example 4 : Verilen sayi cift sayi ise ekrana cift sayi yazdiriniz.

        int num = -18;

        // num = Math.abs(num);  gerek yok, java yine de buna kalan 0 oldugu icin cift sayi der (-18%2 == 0(Bolum: -9))o yuzden kullanma. || or operatoru
        // sadece boolean lar ile kullanilir.

        if (num%2 == 0){
            System.out.println("Cift sayi");
        }

        // Example 5 : Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana Harika sayi yazdirin.

        int r = 250;
        if (r<300 || r>1200){
            System.out.println("Harika sayi");
        }



    }
}
