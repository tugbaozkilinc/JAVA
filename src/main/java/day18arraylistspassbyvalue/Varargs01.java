package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
      1. Farklı sayılardaki parametrelerle calısabilen bir method olusturmak isterseniz varargs kullanmalısınız.
      2. Varargs arka tarafta Array kullanir. Bu yuzden varargs larla calısırken Array lerle calısıyormus gibi davranabilirsiniz.
      3. Varargs olusturmak icin data tipini ve ... koy sonra varargs ismini koy.
      4. Bir method da varargs in yaninda baska bir parametre, varargs en sonda olmak sarti ile kullanilabilir.
      5. Varargs en sonda olmak zorunda oldugundan birden fazla kullanırsaniz en az biri en sonda olmayacaktır, Bu da 4. kural ile celisir.
    */

    // Note: Iyi tester cok hata bulan tester dir.

    public static void main(String[] args) {

        int r1 = add(2, 3);
        System.out.println(r1);

        int r2 = add(2, 3, 4);
        System.out.println(r2);

        int r3 = add(2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(r3);

    }

    // Note: Varargs in arkasinda Arrray calisir.
    public static int add(int ...a){ // ... ismin onune de data tipinden hemen sonraya da getirilebilir bosluksuz da calısır ama genelde bir tarafa yaslarlar.

        int sum = 0;

        for (int w : a){
            sum = sum + w;
        }
        return sum;

    }



}
