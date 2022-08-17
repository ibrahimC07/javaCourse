package day_34_inheritance;

public class Personel {

    /*
    eger parent calss olacak sekilde tasarladaginiz bir class varsa
    veya ilerde bu class'i parent yapmak isteyenler
    variable ve method'larin access modifierini protected yapmaktir
     */


   protected int persNo;
    protected   String isim="Isim belirtilmedi";
    String departman="departman belirtilmedi";


    protected void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretine gore alir");
    }




}
