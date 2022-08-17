package day_14_methodCreation;

import java.util.Scanner;

public class C07_deneme01 {
    public static void main(String[] args) {

        /*

        Kullanicidan bir sayi alin.Bu sayinin
        tek mi cift mi oldugunu,
         sifirdan buyuk mu kucuk mu oldugunu,
         ayrica ve 100'den buyukse birler onlar ve yuzler basamagindaki rakamlarin toplamini,
        100'den kucukse sadece birler basamagini yazdiran
        3 methot olusturun

         */

        int sayi1= tekCift();
        int sayi2= sifiraBagli();
        int sayi3= yuzeBagli();

    }

    public static int yuzeBagli() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi>100){
            int birlerBasamagi=0;
            int rakamlarToplami=0;

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

            System.out.println("rakamlar toplami 100 buyuk son uc rakamin toplami :"+rakamlarToplami);
        }else if (sayi>0 && sayi<100){
            int birlerBasamagindaki=sayi%10;
            System.out.println("yuzden kucuk sayinin ilk basamagindaki sayinin toplami :" +birlerBasamagindaki);


        }

        return sayi;
    }

    public static int sifiraBagli() {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int input2=scan.nextInt();

        if (input2>0){
            System.out.println("sayi pozitif");
        }else System.out.println("sayi negatif");

        return input2 ;
    }

    public static int tekCift() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int input3=scan.nextInt();

        if (input3%2==0){
            System.out.println("sayi cifttir");
        }else System.out.println("sayi tektir");

        return input3 ;
    }
}
