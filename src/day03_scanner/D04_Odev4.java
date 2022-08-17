package day03_scanner;

import java.util.Scanner;

public class D04_Odev4 {

    public static void main(String[] args) {

        //soru4) Kullanicidan dikdortgeler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
//prizmanin hacmini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen dikdortgenler prizmasinin uzun,kisa kenarlarini ve yuksekliklerini " +
                "\naralara enter basacak sekilde giriniz ");

        double sayi1=scan.nextDouble();

        double sayi2= scan.nextDouble();

        double sayi3= scan.nextDouble();


        System.out.println("dikdortgenler prizmasinin hacmi :"+ (sayi1*sayi2*sayi3));



    }
}
