package day07_ifStatements;

import java.util.Scanner;

public class D06_Homework6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Luyfen iki sayi giriniz");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        if (number1 > 0 && number2 > 0) {
            System.out.println("sayilarin toplami :" + (number1 + number2));
        } else if (number1 < 0 && number2 < 0) {
            System.out.println("Sayilarin carpimi : " + (number1 * number2));
        } else if (number1 < 0 && number2 > 0) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        } else if (number1 > 0 && number2 < 0) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        } else if (number1 == 0 || number2 == 0) {
            System.out.println("Sifir carpmaya gore yutan elemandir");
        }
    }
}

