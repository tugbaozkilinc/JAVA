package day25exception;

public class E03 {

    public static void main(String[] args) {

        // Bir String de bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz.

        String str = "Ali";
        getNumOfChars(str); // 3

        String s = "";
        getNumOfChars(s); // 0

        String t = null;
        getNumOfChars(t); // NullPointerException Note: Eger length() method unda null kullanirsaniz bu exception i alirsiniz.


    }

    public static void getNumOfChars(String str){

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println("length() method unda bir problem olustu: " + e.getMessage());
            e.printStackTrace();
        }

    }




}
