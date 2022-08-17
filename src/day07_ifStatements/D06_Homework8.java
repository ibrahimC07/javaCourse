package day07_ifStatements;

import java.util.Scanner;

public class D06_Homework8 {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Maas icin lutfen bir teklif giriniz");
        double salary=scan.nextDouble();

        if (salary>80.000){
            System.out.println("Kabul ediyorum");
        }else if (salary>60.000 && salary<80.000){
            System.out.println("Konusabiliriz");
        }else if (salary<60.000){
            System.out.println("maalesef kabul edemem");
        }
    }

}
