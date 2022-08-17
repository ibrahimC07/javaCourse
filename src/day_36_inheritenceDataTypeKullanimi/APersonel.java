package day_36_inheritenceDataTypeKullanimi;

public class APersonel {

    String isim = "Isim belirtilmedi";
    String soyisim= "Soyisim belirtilmedi";
    String departmant = "departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personelimize sigorta yapilir");
    }
}
