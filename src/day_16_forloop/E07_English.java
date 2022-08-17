package day_16_forloop;

import com.sun.jdi.DoubleValue;

public class E07_English {
    public static void main(String[] args) {

        //find the sum of digits of decimal part in a double number
        //Ex: 23.1528==> 1+5+2+8=16

        double number = 23.1528 ;

        String a= String.valueOf(23.1528);

        String idx=a.substring(a.indexOf(".")+1);
        System.out.println(idx);

        //2. way to find decimal number
       // String decimalPart=a.split("\\.")[1];   ==> bu yoluda kullanabilirsin..  \\. ==> splitte nokta ozal karakter oldugu icin nokta kullanacagimiz zaman boyle kullaniyoruz.

        int b = Integer.valueOf(idx);
        int sum = 0;

        for (int i = b; i >0 ; i=i/10) {
            sum = sum + i%10;




        }
        System.out.println(sum);






    }
}
