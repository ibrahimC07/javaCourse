package recal_day_04;

import java.util.Scanner;

public class Q05_MethodCreation {
    public static void main(String[] args) {
        /*
        cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
         */

    double cm=100;

    donusturulen(cm);


    }

    private static void donusturulen(double cm) {
        double m = cm/100;
        double km=cm/10000;

        System.out.println("meter donusturme :"+m+"\nkmeter donusturme :"+km);
    }


}

