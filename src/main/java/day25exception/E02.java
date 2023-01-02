package day25exception;

public class E02 {

    public static void main(String[] args) {

        // Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun.

        String[] arr = {"Ali", "Can", "Veli", "Han"};
        getElementFromArray(arr, 2); // Veli
        getElementFromArray(arr, 0); // Ali
        getElementFromArray(arr, 4); // Bir problem olustu: Index 4 out of bounds for length 4
                                         // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
                                         // at day25exception.E02.getElementFromArray(E02.java:18)
                                         // at day25exception.E02.main(E02.java:12)


        Object number1 = 40;
        String number2 = (String) number1; // ClassCastException

    }
    public static void getElementFromArray(String[] arr, int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Bir problem olustu: " + e.getMessage());
            e.printStackTrace(); // Note: Bu teknik aciklamaya developer lar tester lar a gore daha cok ihtiyac duyarlar.
        }
    }


    // Note: ClassCastException in Java is one of the unchecked exceptions. ClassCastException is thrown when we try to cast an object of the parent class
    // to the child class object.



}
