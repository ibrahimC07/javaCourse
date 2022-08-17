package recal_day_04;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

      Scanner scan = new Scanner(System.in);
        System.out.println("+,-,*,/ islerinden birini giriniz");
        String islem=scan.next();

        System.out.println("birinci sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();

        hesapMakinesi(islem,sayi1,sayi2);


    }

    private static void hesapMakinesi(String islem, double sayi1, double sayi2) {

        if (islem.equals("+")|| islem.equals("-")||islem.equals("*")||islem.equals("/")){
            switch (islem){
                case "+":
                    System.out.println((sayi1+sayi2)); break;
                case "-":
                    System.out.println((sayi1-sayi2)); break;
                case "*":
                    System.out.println((sayi1*sayi2)); break;
                case "/":
                    System.out.println((sayi1/sayi2)); break;

                default:
                    System.out.println("hatali islem giriis");
            }
        }else System.out.println("hatali giris");
    }
}
