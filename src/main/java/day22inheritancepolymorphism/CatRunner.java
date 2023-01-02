package day22inheritancepolymorphism;

public class CatRunner {

    public static void main(String[] args) {

        /*
          1. Javada object olustururken constructor lar parent dan child e dogru calıstırılır.
          2. Java en ust parent constructor a cıkabilmek icin "super()" kodunu kullanır.
          3. "super()" kodu her constructor un ilk satırında gizli olarak bulunur.
          4. "super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, java kızmaz.
          5. "super()" kodunu gorunur sekilde yazarsanız sakın ilk satır dısında bir satıra koymayınız, hata verir.
          6. "super()" kodu parent class tan constructor cagırmaya yarar.
        */

        Cat cat1 = new Cat();

    }
}
