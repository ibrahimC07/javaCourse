package day09_ternaryoperator;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {


        // Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double sayi=scan.nextDouble();
        System.out.println("sayinin mutlak degeri : " +(sayi>=0 ? sayi : (-1*sayi)));

    }


}
