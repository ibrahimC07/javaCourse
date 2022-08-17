package day_17_nestediforloop;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a gore *'lardan olusan bir ucgen olusturun
        ornek input =4 ise
        *
        * *
        * * *
        * * * *
         */

      int raw=4;

        for (int i = 1; i <=raw ; i++) {
            String s="";
            for (int j = 1; j <=i; j++) {
                s=s+"* ";

            }
            System.out.println(s);


        }
    }
}
