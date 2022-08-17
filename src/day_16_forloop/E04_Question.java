package day_16_forloop;

public class E04_Question {
    public static void main(String[] args) {
        // note : i<uniques.length() ile i<= uniques.lenths()-1 ayni seydir.

        // Example : Type code to print unique characters in a String
        // Alabama==>Albm

        String name="alabama";
        char d = name.charAt(0);
        char e= name.charAt(1);
        System.out.println(""+d+e); // "" charda harf gormek istiyorsan "" bu isareti kullanarak stringe cevirebilirsin
        for (int i = 0; i <=name.length()-1 ; i++) {
            char c = name.charAt(i);
            if (name.indexOf(c)==name.lastIndexOf(c)){
                System.out.print(c);
            }

        }

        System.out.println();
        // Type code to print the following image on the console
        /*
          X X X X X
          X X X X X
          X X X X X
         */

        int col=5;
        int raw=3;

        for (int i = 1; i <=raw ; i++) {
            String s= "";
            for (int j = 1; j <=col  ; j++) {
                s=s+ "X ";

            }
            System.out.println(s);

        }
    }
}
