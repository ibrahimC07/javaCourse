package day03_scanner;

import java.util.Scanner;

public class D03_Odev3 {

    public static void main(String[] args) {

//soru3) kullanicidan yaricap isteyip cemberin cevresini ve dairenin alaini hesaplayip yazdirin
        Scanner scannner=new Scanner(System.in);
        System.out.println("Yaricap giriniz");
        double yariCap=scannner.nextDouble();

        System.out.println("Cevre : "+(2*3.14*yariCap));
        System.out.println("Alan : "+(3.14*(yariCap*yariCap)));


    }

}
