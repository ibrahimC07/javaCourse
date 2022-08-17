package day_17_nestediforloop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // verilen sayiya gore carpim tablosu olusturun
    /*
    input 3
    1 2 3
    2 4 6
    3 6 9
     */

        int raw=3;
        for (int i = 1; i <=raw ; i++) {
            String input="";
            for (int j = 1; j <=raw ; j++) {
                input=input+j*i+" ";

            }

            System.out.println(input);
        }
    }
}
