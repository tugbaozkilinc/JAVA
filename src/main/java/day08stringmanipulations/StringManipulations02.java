package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        // Example 1: Bir String deki space haric kac tane karakter kullanildigini gosteren kodu yaziniz.
        String str = "Ali okula gitti.";
        int num = str.replace(" ","").length();
        System.out.println(num);

        // replace() methodu bir String deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.

        // Example 2: Bir String deki tum 'a' harflerini 'A' ya ceviriniz.
        String s = "Ankara'nin tasina gozlerimin yasina bak.";
        s = s.replace('a','A');
        System.out.println(s);

        //Example 3: Bir String deki tum "kara" kelimesinin yerine "*" koyunuz.
        String t = "Kara kara dusunme Ankara";
        t = t.replace("kara","*");
        System.out.println(t);

        // Example 4: Bir String deki tum sayilari "*" a ceviriniz.
        String studentId = "AC202117004";
        studentId = studentId.replaceAll("[0-9]","*");
        System.out.println(studentId);

        // Note: Bir grup datayi ifade eden kodlara Regex (Regular Expression) denir.
        // 1- [0-9] tum rakamlar.
        // 2- [a-z] tum kucuk harfler.
        // 3- [A-Z] tum buyuk harfler.
        // 4- [a-zA-Z] tum harfler. (Soyle de yazilabilir sira farketmez; [A-Za-z] )
        // 5- [aeiouAEIOU] tum sesli harfler. (Pes pese yazmak hepsini istiyorum demek)
        // 6- [ ] space(Bosluk bırak icine)
        // 7- [0-9a-zA-Z] tum rakamlar ve tum harfler.
        // 8- \\p{Punct} tum noktalama isaretleri(punctuation mark)
        // 1- [^0-9] rakamlar haric tum karakterler.
        // 2- [^a-z] kucuk harfler haric tum karakterler.
        // 3- [^A-Z] buyuk harfler haric tum karakterler.
        // 4- [^a-zA-Z] tum harfler haric tum karakterler.
        // 5- [^ ] space haric.

        // Example 5: Verilen String de kullanilan noktalama isareti, rakamlar ve space karakteri haric tum karakterlerin sayisini bulan kodu yaziniz.
        String u = "Ali 13 yasinda, dersem inanma!...";
        int result = u.
                       replaceAll("[0-9]", "").
                       replace(" ","").                 // Note: Tek karakter sileceksen replace() kullan, replaceAll() bir grup karakter icin kullanilir.
                       replaceAll("\\p{Punct}", "").
                       length();
        System.out.println(result);

        // Example 6: Bir passwordun gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz.
        // 1- Space haric en az 8 karakter olmali. 2- En az bir sembol icermeli. 3- En az bir rakam icermeli. 4- En az bir buyuk harf icermeli. 5- En az bir kucuk harf icermeli.
        // Note: Sembol; rakam, harfler(buyuk-kucuk) ve space disindaki hersey.
        String pwd = "B78c? K!m";
        boolean first = pwd.replace(" ","").length()>7;
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;    // Arrayin icinde space de var; [0-9a-zA-Z ] (Icindekilerin yerleri degisebilir)
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdValid = first && second && third && fourth && fifth;

        if (pwdValid){
            System.out.println("Passwordunuz gecerli");
        } else {
            System.out.println("Passwordunuz gecerli degil");
        }

        // Example 7: Bir String deki noktalama isaretlerinin sayisini gosteren kodu yaziniz.
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]","").length();   // Note: [] icinde kullanmalisin haric demek icin.
        System.out.println(number);

        // Example 8: Verilen bir String "Al" ile basliyor ve x ile bitiyorsa ekrana "Harika" yazdirin aksi durumda "Normal" yazdirin.
        String v = "Alex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String sonuc = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(sonuc);



    }
}
