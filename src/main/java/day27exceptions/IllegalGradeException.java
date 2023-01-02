package day27exceptions;


public class IllegalGradeException extends Exception{

    // Java nin trafik kurallari hukmunde diyebilecegimiz bircok exception i vardir. Biz kendimiz de application uretirken application imiza ozel kurallar koyariz.
    // Yani biz de exception olusturabiliriz. Bunun icin bir exception class olusturacagiz.
    // Naming convention: Butun exception class isimlerinin sonunda Exception kelimesi vardir. Fakat isme IllegalGradeException yazmakla java bunun exception oldugunu anlamaz.
    // Bu yuzden extends Exception yapmaliyim. Cunku butun exception lar Exception in child idir.
    // Eger Exception Class a extend ederseniz sizin class iniz "CompileTimeException" olur.

    public IllegalGradeException(String message){ // Ben bir exception objesi olustururken mesaj da basmak istiyorum.
        super(message); // Parent a git o parent ta bu mesaji kabul edecek constructor i kullan. Parent bunu halledecektir.
    }





}
