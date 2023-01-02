package day24statickeywordencapsulation;

    // Encapsulation: "Data Hiding" demektir.
    // Data yi nicin gizlersiniz? Data yi dis etkenlerden korumak icin.
    // Data yi nasil gizlersin? Access modifier ini "private" yaparak gizlerim.
    // Data yi gizledikten sonra baska Class lardan okumak istersen ne yaparsin? "get method" lar(getter) olusturarak gizledigimiz data lari okunur hale getirebiliriz.
    // Data yi gizledikten sonra baska Class lardan degistirmek istersen ne yaparsin? "set method" lar(setter) olusturarak gizledigimiz data lari degistirebiliriz.
    // Variable in data type i ile get method un return type i ayni olmalidir.
    // "get method" lari isimlendirirken(naming convention) "getVariableName" ancak variable in data tipi boolean ise "isVariableName"
    // getter and setter method lari "Java Beans" olarak da adlandirilir.
    // getter(), setter() saklanan data lari sirasiyla obje uzerinden okumamizi ve update edebilmemizi saglar.
    // Encapsule edilen variable ve method lara sadece sizin verdiginiz oranda erisilebilir.
    // Encapsulation iki adimda yapilir;
    // Class uyelerini(variable, method) private yapmalisiniz, public olan getter ve setter method lar uretmelisiniz.

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {  // shift basılı tut asagi in dene bunu
        return stdId;
    } // shift e bas birinciyi sec okla asagi surukle hepsini secmis olursun.

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    } // set methodu bize data vermez degisimi yapar birakir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }


}
