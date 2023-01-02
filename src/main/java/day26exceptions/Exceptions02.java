package day26exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        char ch1 = getCharFromString("Java", 2);
        System.out.println(ch1); // v

        char ch2 = getCharFromString("Selenium", 8);
        System.out.println(ch2); // Index ile ilgili bir problem olustu: String index out of range: 8


    }

    public static char getCharFromString(String str, int idx){

        char c = ' ';
        try{
            c = str.charAt(idx);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Index ile ilgili bir problem olustu: " + e.getMessage()); // Genel kullanim bu sekildir(teknik ve teknik olmayan message)
            e.printStackTrace(); // Detayli "log"(sistem gunlugu) yani consol da gordugumuz akis icin kullanilir.
        }
        return c;

    }

    // Eger bir String ten bir karakter/ler alirken olmayan bir index kullanilirsa StringIndexOutOfBoundsException alinir.


}
