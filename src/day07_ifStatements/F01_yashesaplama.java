package day07_ifStatements;

import java.util.Scanner;

public class F01_yashesaplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz yili giriniz");
        int yas=scan.nextInt();

        if (yas<1900){
            System.out.println("yanlis girdiniz lutfen tekrar deneyiniz");
        }else System.out.println((2022-yas)+" yasindasiniz");

    }
}
