package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // Note: Ayni data type taki coklu datayi depolamak icin javanin olusturdugu yapilar vardir. Bu yapilardan birisi de Array lerdir.

        int stdAges[] = new int[7]; // Koseli parantez i data type in hemen sonrasina**, ismin onune ya da sonuna koyabilirsin.
        System.out.println(Arrays.toString(stdAges)); // [0, 0, 0, 0, 0, 0, 0]

        // Array lere element ekleme;

        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;

        System.out.println(Arrays.toString(stdAges));

        // Array deki herhangi bir elemani yazdirma;

        System.out.println(stdAges[4]);

        // Example 1: Array deki en buyuk ve en kucuk elemanin toplamini yazdiriniz. (Note: Burdaki length method degil bir variable.)

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk = stdAges[0];
        int son = stdAges[stdAges.length-1];
        System.out.println(ilk + son);

        // Example 2: stdAges Array i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.

        // 1. yol:
        int sum = 0;

        for (int i = 0; i<stdAges.length; i++){
            sum = sum + stdAges[i];
        }

        System.out.println(sum);

        // 2. yol:
        sum = 0;
        int k = 0;

        while (k< stdAges.length){
         sum = sum + stdAges[k];
         k++;
        }

        System.out.println(sum);

        // 3. yol:
        sum = 0;
        int m = 0;

        do {
           sum = sum + stdAges[m];
           m++;
        }while (m<stdAges.length);

        System.out.println(sum);

        // 4. yol:
        sum = 0;

        for (int w: stdAges){   // Note: for-each loop en gelismis loop tur. Mumkunse her zaman bunu kullan. Array lerde ve Collections larda kullanilir.
            sum = sum + w;
        }

        System.out.println(sum);

        // Example 3: String bir Array olusturunuz. Bu Array e 5 tane isim yerlestiriniz. Sonra bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz.

        String arr[] = new String[5];

        arr[0] = "Ali";
        arr[1] = "Tom";
        arr[2] = "Veli";
        arr[3] = "Kemal";
        arr[4] = "Cem";

        int result = 0;

        for(String w: arr){
            result = result + w.length();
        }

        System.out.println(result);

        // Example 4: char bir Array olusturunuz. Bu Array e 5 eleman ekleyiniz ve Array deki sadece buyuk harfleri ekrana yazdiriniz.

        char[] ch = {'A', 'c', 'D', 'k', 'M'};

        for (char w: ch){
            if (w>='A' && w<='Z'){
                System.out.print(w);
            }
        }



    }
}
