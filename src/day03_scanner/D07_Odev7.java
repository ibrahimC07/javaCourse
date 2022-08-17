package day03_scanner;

import java.util.Scanner;

public class D07_Odev7 {


    public static void main(String[] args) {

        //soru7) Kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");

        char isim=scan.next().toUpperCase().charAt(0);

        System.out.println(isim);

    }
}
