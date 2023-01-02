package day29abstractioncollections;

public interface Engine extends Vehicle{

    // Child              Parent
    // Class -->          Interface   "implements"
    // Class -->          Class       "extends"
    // Interface -->      Interface   "extends"
    // Interface -->      Class       mumkun degil
    // Abstract Class --> Interface   "implements"

    // interface lerdeki tum variable lar otomatik olarak(by default) "public" tir.
    // interface lerdeki tum variable lar otomatik olarak(by default) "static" dir.
    // interface lerdeki tum variable lar otomatik olarak(by default) "final" tir.


    int price = 2000;
    double weight = 23.5;

    void run();


}
