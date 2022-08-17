package day_17_nestediforloop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen String'i asagidaki gibi yazdiran bir program yazalim

        input = Deniz

        D
        De
        Den
        Deni
        Deniz

         */

       String input = "Deniz";

        for (int i = 1; i<=input.length() ; i++) {
            String d= "";
            for (int j = 1; j <=i ; j++) {
                d=d+input.substring(j-1,j);

            }
            System.out.println(d);

        }
    }
}
