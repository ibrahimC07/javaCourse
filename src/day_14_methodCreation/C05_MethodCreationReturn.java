package day_14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {

    public static void main(String[] args) {
        /*
        eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin
        islemi bir method'da yapip
        sonucunu main method'a dondurebiliriz
        Return type'i void olmayan bir methodun sonucunu
        main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri alip kullanma sansimiz olur.
         */

        // kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // sehir ismini pragramaminzda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir= sehirAl();
        String tarih= tarih();
        System.out.println("sehriniz :" + sehir);
        System.out.println("tarihi :"+ tarih);

    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sehir giriniz");
        String memleket=scan.nextLine().toUpperCase();

        return memleket ;
    }

    public static String tarih() {
        String tarih = "" ;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil=scan.nextInt();
         if (yil>1900 && yil<2100){
             tarih=yil+"-";
         }else System.out.println("Belirtilen araliklarda giriniz");
        System.out.println("Lutfen ay giriniz :");
        int ay=scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("Lutfen 0-12 arasinda giriniz");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-" ;
        }else tarih=tarih+ay+"-";
        System.out.println("Lutfen gun giriniz");
        int gun=scan.nextInt();
        if (gun<=0 || gun>365){
            System.out.println("lutfen 0-365 arasinda bir sayi giriniz");
        }else if (gun<10){
            tarih=tarih+"0"+gun ;
        }else tarih=tarih+gun ;

        return tarih ;
    }
}
