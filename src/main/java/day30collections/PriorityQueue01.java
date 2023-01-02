package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    /*
      PriorityQueue(oncelik sirasi) da Java kendisine gore bir oncelik belirleyerek siralama yapar. Bu random sıralama degildir, java kendine gore bir kural belirler
      ve o kurala gore bir siralama yapar. Biz PriorityQueue kullanarak kendi siralama kuralimizi olusturabiliriz. (Lambda da gorecegiz.)
      PriorityQueue nun mantigi sudur; biz soylemedikce java elemanlari kendi siralama kuralina gore dizer.
    */

    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");
        System.out.println(myQueue); // [A, C, B, G, E]



    }
}
