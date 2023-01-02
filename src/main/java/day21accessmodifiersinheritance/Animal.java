package day21accessmodifiersinheritance;

public class Animal {

    /*
      Note: Biz Cat, Dog, Bird class larina ayri ayri eat() ve drink() methodlarini koyabiliriz. Ama bu sekilde tekrara dusmus oluruz. Javada tekrarlar sevilmez.
      Kod yazarken tekrar yapmak dogru degildir. Bu birinci problemdir. Biz su an animal larla ilgili 3 tane class olusturduk fakat gercek application larda bu class lar
      yuzlerce hatta binlerce olabilir. Bu durumda eat() ve drink() methodunu bin kere yazmamiz gerecektir. eat() methodunda degisiklik yapmamiz gerektiginde hepsinde tek tek
      degisiklik yapmamiz gerekir. Bu da ikinci problemdir. Boyle structure larda kod lari degistirmek ve tamir etmek cok mumkun degildir. Ucuncu problem ise sudur; bir kedinin
      bes bin tane aksiyonu olabilir. Cat class inin icine 5 bin tane method koyarsak Cat class i cok buyuk olur. Buyuk seyler yavas calisir. Bir seyin hızlı calısmasını
      istiyorsan o seyi kucuk yani atomik yapmalisin. Yazilim dunyasinda atomik structure tercih edilir. Calisan kod yeterli degildir; bir kod hem calismali hem de standartlara
      uygun olmaldir. eat() methodu icin de ayri bir yerde olusturdugumuz eat1() eat2() eat3() method larini cagırarak eat() methodunu atomik yapabiliriz.
      Java bu problemi cozmek icin inheritance olusturmustur. Bu suna benzer; bir ailedeki butun child larin yazlik almasi pahali ve gereksizdir, onun yerine parent bir yazlik alir
      ve tum child lar bu yazligi kullanir.
    */

    public void eat(){
        System.out.println("Animals eat");
    }
    public  void  drink(){
        System.out.println("Animals drink");
    }


}
