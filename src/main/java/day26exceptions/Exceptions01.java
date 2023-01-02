package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        String str = "123";
        int result = convertStringToInteger(str);
        System.out.println(result + 5); // Burasi try bolumu
                                        // 128
        String st = "1a2b";
        int r = convertStringToInteger(st);
        System.out.println(r + 10); // Rakam olmayan karakter iceren String ler Integer a cevrilemez
                                    // 10

    }

    public static int convertStringToInteger(String str){

        int i = 0;
        try{
            i = Integer.valueOf(str); // Burda hata alinca calismayi durdurur ve exception atar, direk catch bolumune gecer, System.out.println("Burasi try bolumu"); bu kodu calistirmaz.
                                      // Herhangi bir satirda exception atilirsa java direk catch bolumune gecer try icindeki sonraki kodlari calistirmaz.
                                      // catch ve catch ten sonrakileri calistirir.
            System.out.println("Burasi try bolumu");
        } catch (NumberFormatException e){
            System.out.println("Rakam olmayan karakterleri iceren String ler Integer a cevrilemez");
        }
        return i;

    }
    // Note: Eger icinde rakamdan farklı character barindiran bir String i valueOf() methodu kullanarak Integer a cevirmek isterseniz NumberFormatException alirsiniz.



}
