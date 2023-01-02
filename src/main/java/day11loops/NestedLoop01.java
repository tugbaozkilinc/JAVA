package day11loops;

public class NestedLoop01 {

    public static void main(String[] args) {

        /*
        Example 1: Type code to get the output like;
        Week: 1
        Day: 1
        Day: 2
        Day: 3
                          .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
                          ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
                          ....
        */

        int week = 4;
        int day = 7;

        for (int i = 1; i<=week; i++){
            System.out.println("Week: " + i);
            for (int k = 1; k<=day; k++){
                System.out.println("Day: " + k);
            }
        }

        // Note: Variable larin erisilebilirlik kapsami vardir, bu kapsama scope adi verilir. Iki curly braces arasinda
        // olusturdugun variable i sadece o curly braces lar arasinda kullanabilirsin disinda kullanamazsin.
        // Nested code lar uzun surede calisir. Mumkun oldugu kadar nested lari kullanmamaya calisiriz. Time Complexity den dolayi.



    }
}
