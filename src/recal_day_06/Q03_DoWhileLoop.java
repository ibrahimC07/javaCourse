package recal_day_06;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanicida x girilene kadar ekrana "program calisiyor" yazan
        ve x girildiginde ise "program bitti" yazan program yaziniz
         */

       Scanner scan= new Scanner(System.in);
        String okunan="";
        do {
            System.out.println("harf giriniz : ");
            okunan = scan.next();
            System.out.println("program calisiyor");
        }while(!okunan.equalsIgnoreCase("X"));
        System.out.println("Program bitti");
    }
}
