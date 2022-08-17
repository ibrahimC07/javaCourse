package day_35_inheritencedaConstructorKullanimi;

public class EMuhasebe extends Dpersonel{

    EMuhasebe (){
        System.out.println("muhasebe parametresiz ccons");
    }

    EMuhasebe (String isim){
        System.out.println("muhasebe paramatreli cons");
    }
}
