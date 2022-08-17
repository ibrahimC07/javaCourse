package day03_scanner;

import java.util.Scanner;

public class D02_Odev2 {

    public static void main(String[] args) {
        //soru-2)kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayin
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen karenin bir kenar uzunlugunu giriniz");

        double sayi1=scan.nextDouble();

        System.out.println("karenin alani :" +(sayi1*sayi1));

        System.out.println("karenin cevresi :"+(4*sayi1));
    }
}
