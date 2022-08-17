package day_17_nestediforloop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen input'a gore asagida sekli olusturun

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */

        // artan kismi nested forloop ile yapalim
        int raw=4;

        for (int i = 1; i <=raw ; i++) {
            String s="";
            for (int j = 1; j <=i ; j++) {
                s=s+"* ";


            }
            System.out.println(s);

        }
        for (int i = raw-1; i >0 ; i--) {
            String d ="";
            for (int j = i; j >0 ; j--) {
                d=d+"* ";

            }
            System.out.println(d);

        }
    }
}
