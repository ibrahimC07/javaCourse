package day07_ifStatements;

import java.util.Scanner;

public class D01_Homework {

    public static void main(String[] args) {

        /*
        Kullanicidan bir tamsayi isteyin ve sayinin tek veya cidt oldugunu yazirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int tamSayi=scan.nextInt();

        if(tamSayi%2==0){

            System.out.println(" girilen sayi cifttir");
        } else {

            System.out.println("girilen sayi tektir");
        }


    }
}
