package day07_ifStatements;

import java.util.Scanner;

public class D04_homework {

    public static void main(String[] args) {
       /*
       Kullanıcıdan bır gun alın eger gun alin eger gun"Cuma" ise ekrana
       "Muslumanlar icin kutsal gun" yazdirin. "Cumartesi" ise
       ekrana "Yahudiler icin kutsal gun" yazdirin. "Pazar" ise
       ekrana "Hristiyanlar icin kutsal gun" yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun=scan.next();

        if(gun.equals("Cuma")){
            System.out.println("Muslumanlar icin kutsal bir gun");
        }

        if(gun.equals("Cumartesi")){
            System.out.println("Yahudiler icin kutsal bir gun");
        }

        if(gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal bir gun");
        }

    }

}
