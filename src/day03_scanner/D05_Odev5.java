package day03_scanner;

import java.util.Scanner;

public class D05_Odev5 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        String isim=scan.next();

        System.out.println("lutfen soyisminizi giriniz");

        String soyIsim=scan.next();

        System.out.println("isminiz :"+ isim+ "\nSoyisminiz :" +soyIsim+ "\nKursumuza katiliminiz alinmistir,tesekkur ederiz" );


    }
}
