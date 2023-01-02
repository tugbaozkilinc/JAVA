package day16multidimensionalarraysarraylists;

public class MultidimensionalArray02 {

    public static void main(String[] args) {

        // Example 1: Bir multidimensional Array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {83, 75}};

        int maxValue = arr[0][0];
        int minValue = arr[0][0];

        for (int[] w : arr){
            for (int z : w){
               maxValue = Math.max(z, maxValue);
               minValue = Math.min(z, minValue);
            }
        }

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
        System.out.println("Sum is: " + (minValue + maxValue));



    }
}
