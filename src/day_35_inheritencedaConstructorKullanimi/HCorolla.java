package day_35_inheritencedaConstructorKullanimi;

public class HCorolla extends Gtoyota{

    HCorolla(){
        System.out.println("Corolla parametresiz cons");
    }

    HCorolla(String isim){
        super(isim);
        System.out.println("Hcrolla paramtreli cons");
    }
}
