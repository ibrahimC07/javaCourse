package day03_scanner;

import java.util.Scanner;

public class D06_Odev6 {

    public static void main(String[] args) {


        //soru6) kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak
//asagidaki sekilde yazdirin
//Isim-soyisim : Mehmet Bulutluoz

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");

        String soyIsim=scan.nextLine();


        System.out.println("Isim - soyisim :"+isim+ " "+soyIsim);



    }

}
