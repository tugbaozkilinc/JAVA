package day21accessmodifiersinheritance;

public class StudentRunner {

     // Application larda genellikle bir tane main method olur ve yuzlerce binlerce class olabilir. Her bir class a main method koymayız. Cunku main method arabanin motoru gibidir
     // ve her arabada genellikle bir tane motor olur. Bir class in icinde main method olur ve diger tum class lardaki kodlari calistirir.
     // Biz olusturdugumuz "Student" class a main method koymadık, bu class icine main method koyduk ve burdan diger class lardaki kodlari calistiracagiz.
     // Genellikle icinde main method olan class lara runner ismini koyarlar. "StudentRunner". "StudentRunner" dan "Student" class daki kodlara ulasip calistiracagim.
     // Bunun icin oncelikle bir obje olusturmalıyız. Note: Ulasmak istedigimiz class tan obje olusturuyoruz.

     public static void main(String[] args) {

          Student std1 = new Student();
          System.out.println(std1.stdName);
          System.out.println(std1.address);
          System.out.println(std1.email);


     }
}
