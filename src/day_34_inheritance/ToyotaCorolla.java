package day_34_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class'dan parent class'a erisimde
        access modifier kurallarini bypass edemeyiz
        ornegin parent classtaki private class uyelerini
        child classtan kullanamayiz parent classtaki
        default access modifier'i olan class uyelerini
        child class'tan kullanamayiz
         */

        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);  // Toyota
        System.out.println(arb1.model); //Model belirtilmedi



    }



}
