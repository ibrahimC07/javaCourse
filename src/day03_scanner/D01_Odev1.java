package day03_scanner;

import java.util.Scanner;

public class D01_Odev1 {

    public static void main(String[] args) {

        //soru-1)kullanicidan iki tam sayi alip bu sayilarin toplam fark ve carpimlarini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ilk tamsayiyi giriniz");
        int ilkTamsayi=scan.nextInt();
        System.out.println("lutfen ikinci tamsayiyi giriniz");
        int ikinciTamsayi=scan.nextInt();
        System.out.println("iki sayinin toplami : "+ (ilkTamsayi+ikinciTamsayi));
        System.out.println("iki sayinin carpimi : "+ (ilkTamsayi*ikinciTamsayi));
        System.out.println("iki sayinin carpimi : "+ (ilkTamsayi-ikinciTamsayi));

    }
}
