package day32maps;

import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {

        // Example 1: Size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz.

        String word = "Mississippi";
        HashMap<String, Integer> appearance = new HashMap<>();
        String letters[] = word.split("");

        for (String w : letters){
            Integer appearanceNumber = appearance.get(w);
            if(appearanceNumber==null){
                appearance.put(w, 1);
            } else {
                appearance.put(w, appearanceNumber+1);
            }
        }
        System.out.println(appearance);




    }
}
