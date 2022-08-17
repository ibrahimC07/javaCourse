package day_14_methodCreation;

import java.util.Scanner;

public class C07_deneme02 {
    public static void main(String[] args) {

     String sayi= String.valueOf(sayiAl());
        System.out.println("sayi toplama :" +sayi);

    }

    public static int sayiAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac sayi toplamak istiyorsunuz");
        int rakam=scan.nextInt();

        if (rakam==2){

            System.out.println("birinci sayiyi giriniz");
            int sayi1=scan.nextInt();
            System.out.println("ikinci sayiyi giriniz");
            int sayi2=scan.nextInt();
            System.out.println("2 sayininin toplami :"+(sayi1+sayi2));
        }else if (rakam==3){

            System.out.println("birinci sayiyi giriniz");
            int sayi3=scan.nextInt();
            System.out.println("ikinci sayiyi giriniz");
            int sayi4=scan.nextInt();
            System.out.println("ucuncu sayiyi giriniz");
            int sayi5=scan.nextInt();
            System.out.println("3 sayininin toplami :"+(sayi4+sayi5+sayi3));
        }else if (rakam==4){

            System.out.println("birinci sayiyi giriniz");
            int sayi6=scan.nextInt();
            System.out.println("ikinci sayiyi giriniz");
            int sayi7=scan.nextInt();
            System.out.println("ucuncu sayiyi giriniz");
            int sayi8=scan.nextInt();
            System.out.println("dorduncu sayiyi giriniz");
            int sayi9=scan.nextInt();
            System.out.println("4 sayininin toplami :"+(sayi6+sayi7+sayi8+sayi9));
        }else System.out.println("Cok sayi girdiniz , ben toplayamam");

        return rakam;
    }
}
