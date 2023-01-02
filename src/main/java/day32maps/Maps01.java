package day32maps;

import java.util.HashMap;

public class Maps01 {

    public static void main(String[] args) {

        // Example 1: Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz.

        String s = "I like to move it, move it.";
        s = s.replaceAll("\\p{Punct}", "");
        String words[] = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        // 1. yol:
        for (String w : words){
            if(!map.containsKey(w)){
                map.put(w, 1);
            } else {
                map.put(w, map.get(w)+1);
            }
        }
        System.out.println(map);

        // 2. yol:
        HashMap<String, Integer> map1 = new HashMap<>();
        for (String w : words){
            Integer appearance = map1.get(w); // get() method u key map te varsa value sunu verir, yoksa null verir.
            if(appearance==null){
                map1.put(w, 1);
            } else {
                map1.put(w, appearance+1);
            }
        }
        System.out.println(map1);





    }
}
