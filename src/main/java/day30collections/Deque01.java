package day30collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*
      Deque: Double Ended(iki uclu) Queue manasindadir, yani iki uclu Queue demektir. Icinde top olan iki uclu bir boruyu dusun; alttakini kullanirsan FIFO
      usttekini kullanirsan LIFO calisir.
      FIFO ve LIFO beraber gerektiginde kullanilir.
    */

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>(); // Deque bir interface, sadece child i olan LinkedList<>() kullanilabilir.
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck); // [Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        /*
          Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
          if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
          ***This method is equivalent to addFirst.
          Throws:
          IllegalStateException – if the element cannot be added at this time due to capacity restrictions
          ClassCastException – if the class of the specified element prevents it from being added to this deque
          NullPointerException – if the specified element is null and this deque does not permit null elements
          IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
        */
        furnitureTruck.push("Refrigerator");
        System.out.println(furnitureTruck); // [Refrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]




    }
}
