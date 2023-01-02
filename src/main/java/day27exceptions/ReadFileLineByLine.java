package day27exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        readFileLineByLine();

    }

    public static void readFileLineByLine(){

        // BufferedReader() constructor i FileReader() objesi ile calisiyor.
        // FileReader kirmizi olacak; More actions - surround with try-catch
        // readLine  kirmizi olacak; More actions - 'catch' clause(s) (coklu catch block kullanabiliyoruz bu sekilde)

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\day27exceptions\\File1.txt"));
            String line = br.readLine(); // readLine() dosyanin ilk satirina gider ve o datayi line nin icine koyar.
            while (line!=null){
                System.out.println(line);
                line = br.readLine(); // Dongude her seferinde bir sonraki satiri line in icine koyar.
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak karakter veya karakterler var " + e.getMessage());
        }

    }

    // Note: Satır satır okuma karakter karakter okumaya gore daha iyi bir yontemdir.
    /* "throw" ile "throws" arasindaki farklar nelerdir?
       1. "throw" method un body si icinde kullanilir. "throws" ise method un isminden sonra kullanilir.
       2. "throw" dan sonra obje olusturulur. "throws" dan sonra ise sadece Exception Class in ismi yazilir.
       3. "throw" method un icinde istedigimiz yerde Exception uretmek icin kullanilir. "throws" ise var olan checked Exception i atmak icin kullanilir.
       4. "throw" dan sonra sadece bir tane Exception olabilir. "throws" dan sonra birden fazla Exception olabilir.
    */



}
