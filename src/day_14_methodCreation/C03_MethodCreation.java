package day_14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // inpur olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I**** K***** seklinde yazdiran bir method olusturun

       String isim = "Enes" ;
       String soyisim= "Bozkurt" ;

       isimgizle(isim,soyisim);
       C02_MethodCreation.rakamlariToplami(654);
    }

    public static void isimgizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println("Verilen ismin tersten yazilisi :" +isim+"\n"+soyisim);
    }
}
