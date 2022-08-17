package day_35_inheritencedaConstructorKullanimi;

public class Gtoyota {

    Gtoyota(){
        System.out.println("toyota parametresiz cons");
    }

    Gtoyota(String isim){

        // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez
        System.out.println("Gtoyota paramtresli cons");


    }
}
