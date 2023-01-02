package day31maps;

import java.util.*;

public class HashMap01 {

    /*
       Note: Maps
                 --> HashMap
                 --> HashTable
                 --> TreeMap
       Note: Map ayni ozelliklere sahip objelerin kendilerini ve ozelliklerini store edebilecegimiz bir interface tir, Collections Framework un bir uyesidir.
       Note: Map Collection olusturulmasina olanak taniyan bir yapi oldugu icin once Collection lari sonra Map leri ogrendik.

       1. Map'ler key-value structure ni kullanir.
       2. Key'ler unique'dir, bu sebeple EntrySet ler de unique tir.
       3. Value'lar tekrarli data icerebilir.
       4. Map'lerde eleman degil "EntrySet" ifadesi kullanilir.
       5. (HashMap)Key'ler de null tekrarsiz olarak kullanilir(uzerine overwrite yapilir)
       6. (HashMap)Value'lar null kabul eder.(null bircok kere kullanilabilir)
       7. HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, random siralamaya koyar.
       8. Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli(super fast) calisirlar.

       Note: Primitive ler hicbir Collection da ve hicbir Map te kullanilamaz.
       Note: Map ler database gibi davranir. Key leri ya da value lari alip istedigin isleme sokabilirsin.
       Note: Loop Collection larda kullanilir, Map te loop kullanamazsin.
    */

    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        System.out.println(studentAges); // {Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=13}
        studentAges.put("Ali", 88); // Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar.
        System.out.println(studentAges); // {Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);
        System.out.println(studentAges); // {null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        // Map'den sadece key'ler nasil alinir?
        Set<String> keys = studentAges.keySet();
        System.out.println(keys); // [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        // Map'den sadece value'lar nasil alinir?
        Collection<Integer> values = studentAges.values();
        System.out.println(values); // [66, null, null, 21, 76, 12, 75, 88]

        // Belli bir key'e ait value nasil alinir?
        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge); // 75

        // Example 1: Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz.
        Collection<Integer> ages = studentAges.values(); // Collection larda for-each loop kullanilir.
        int sum = 0;
        double counter = 0;
        for(Integer w : ages){
            if(w!=null){
                sum += w;
                counter++;
            }
        }
        System.out.println("Ortalama Yas: " + (sum/counter)); // Ortalama Yas: 56.333333333333336
                                                              // Concatination ile matematik islemi bir arada yapildiginda islem onceligi olsa bile (sum/counter)
                                                              // seklinde yazmak tavsiye edilir.

        // Example 2: A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.
        // [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]
        Set<String> names = studentAges.keySet();
        int sum1 = 0;
        for(String w : names){
            if(w!=null && !w.startsWith("A")){ // w!=null yerine equals da kullanabilirsin. !w.startsWith("A") && w!=null yazinca exception atiyor.
                sum1 += w.length();
            }
        }
        System.out.println(sum1); // 25

        System.out.println(studentAges); // {null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}
        // remove("Ajda", 76) key'si Ajda ve value'su 76 olan EntrySet i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result); // true

        Integer result1 = studentAges.remove(null);
        System.out.println(result1); // 66
        System.out.println(studentAges); // {Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        // getOrDefault() methodu key varsa o key in value'sunu verir, key yoksa sizin istediginiz degeri verir
        Integer result01 = studentAges.getOrDefault("Brad", 0);
        System.out.println(result01); // 12
        Integer result2 = studentAges.getOrDefault("Brandon", 0);
        System.out.println(result2); // 0

        // putIfAbsent() value null ise ekleme yapar, value null degilse ekleme yapmaz.
        Integer result3 = studentAges.putIfAbsent("Brad", 100);
        System.out.println(result3); // 12
        System.out.println(studentAges); // {Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4); // null
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        // putIfAbsent() key yoksa ekleme yapar
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5); // null
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}

        // replace() method'u value'lari degistirmek icin kullanilir; value'lari key'e bakarak degistirir.
        studentAges.replace("Acun Ilicali", 49);
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}

        // replace() method'u value'lari degistirmek icin kullanilir; key ve value'yu kontrol ettikten sonra degistirir.
        studentAges.replace("Acun Ilicali", 47, 53);
        System.out.println(studentAges.replace("Acun Ilicali", 47, 53)); // false
        System.out.println(studentAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=49, Ali=88}
                                         // Acun Ilicali nin yasi 47 olmadigi icin degistirmedi.

        // Example 3: Map deki her bir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.
        // entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir.
        Set<Map.Entry<String,Integer>> entries = studentAges.entrySet(); // Set<Map.Entry<K, V>>
        for(Map.Entry<String,Integer> w : entries){
            System.out.println(w);
        }






    }
}