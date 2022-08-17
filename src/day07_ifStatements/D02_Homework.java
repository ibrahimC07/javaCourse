package day07_ifStatements;

import java.util.Scanner;

public class D02_Homework {
    public static void main(String[] args) {

        /*

        Kullanicidan gun isimlerinden birinin ilk harfini isteyin
        ve o harfle baslayan gun isimlerini yazdirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Gun isimlerinden birinin ilk harfini giriniz");

       String ilkHarf=scan.next().toUpperCase();

        if(ilkHarf.equals("P")){
            System.out.println("Pazartesi,Pazar,Persembe");
        }

        if(ilkHarf.equals("S")){

            System.out.println("Sali");
        }

        if(ilkHarf.equals("C")){
            System.out.println("Carsamba,cuma,cumartesi");

        }

        if (!(ilkHarf.equals("P") || ilkHarf.equals("S") || ilkHarf.equals("C"))){

            System.out.println("Lutfen gecerli bir harf giriniz");
        }



    }

}
