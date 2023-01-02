package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        // Example 1: Passwordun ilk harfi buyuk harf ise; 'A' olursa gecerli pwd aksi halde gecersiz pwd.
        // Passwordun ilk harfi kucuk harf ise; 'z' olursa gecerli pwd aksi halde gecersiz pwd.
        // Note: Eksik senaryoyu dikkate al.

        String pwd = "Axy12!";
        char initial = pwd.charAt(0);

        if (initial>='A' && initial<='Z'){
            if (initial=='A'){
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password");
            }
        } else if (initial>='a' && initial<='z'){
            if (initial=='z'){
                System.out.println("Gecerli password");
            } else {
                System.out.println("Gecersiz password");
            }
        } else {
            System.out.println("Ilk karakter harf olmalidir.");
        }

        // pwd.charAt(0); ifadesini her seferinde parantez icine yazmaktansa, bu degeri bir container olusturup icine koymak code standartlarina gore daha uygundur.
        // Bunun mantigi su; Bir baba ogluna 6 ekmek al dediginde cocuk herseferinde bir ekmek alir gelirse bu mantiksiz bir cozum yolu olur. Bunu yapmaktansa
        // cocugun eline bir sepet alip 6 ekmegi alip getirmesi mantikli bir cozum yoludur. Burda da bir degeri birden cok kez kullanacagimiz icin yukarida
        // variable olusturup bu degeri bir kez almak ve ihtiyac duydugumuz her seferinde onu kullanmak daha mantiklidir. Bu cozum yolu kodu hizlandirir.
        // Nested if tavsiye edilmez. Cunku java nested kodlari calistirirken cok fazla zaman harcar. Buna Time Complexity denir. Bu yuzden mumkunse nested
        // kod yazmamaya calisiriz.



    }
}
