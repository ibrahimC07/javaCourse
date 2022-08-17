package day08_ifstaments;

import java.util.Scanner;

public class C02_IfElseIsStatements {

    public static void main(String[] args) {

        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // 50-60 arasi "C",
        // 60-80 arasi "B",
        // 80’nin uzerinde ise "A"


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 0-100 arasinda bir sayi giriniz");
        double number=scan.nextDouble();

        if (number<0 || number>100){
            System.out.println("Lutfen gecerli bir sayi giriniz");
        } else if (number<50){
            System.out.println("notunuz : D" );
        } else if (number<60){
            System.out.println("notunuz : C");
        }else if (number<80){
            System.out.println("notunuz : B");
        }else {
            System.out.println("Notunuz : A");
        }




        }



}
