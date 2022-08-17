package day08_ifstaments;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseStatements {

    public static void main(String[] args) {


        // Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        // Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        // ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        // gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz");
        String day=scan.nextLine().toLowerCase();

        if (day.equals("pazartesi")|| day.equals("pazar")){
            System.out.println("Paz");
        }else if (day.equals("sali")){
            System.out.println("Sal");
        }else if (day.equals("carsamba")){
            System.out.println("Car");
        } else if (day.equals("persembe")){
            System.out.println("Per");
        }else if (day.equals("cuma") || day.equals("cumartesi")){
            System.out.println("Cum");
        }else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }


    }
}
