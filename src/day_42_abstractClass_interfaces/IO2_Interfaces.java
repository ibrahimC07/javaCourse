package day_42_abstractClass_interfaces;

public interface IO2_Interfaces {
    /*
    Interface bir class degildir

    Abstract class'lar java'da abstraction(soyutlastirma / kural koyma)
    islevini yapiyordu
    ancak abstract bir class'da abstract olmayan methodlar da olablir
    bu da full abstraction yapmaya izin vermez

    eger Java'da icinde hic concrete method lmasin
    dedigimiz bir class olusturmak istiyorsaniz
    bunu class degil interface yapmalisiniz.

     1- INTERFACE'LERDE CONCRETE METHOD OLMAZ
     2- Interface'lar full abstraction yaptigindan Interface'lerden obje olusturulamaz
       Hatirladiginiz gibi Interface olan List'den direk obje olusturamiyorduk
       List<String> liste = new List<>();  calismaz
       Bunun yerine constructor'i List'in child'i olan ArrayList'den seceriz
       List<String> liste = new ArrayList<>();
    3- Class'larda bir child birden fazla parent edinemez
       Ancak Interface'lerde concrete method olmadigindan
       biz her methodu child class'da override etmek zorundayiz,
       Override ederken kimin soyledigini override ettigimizin onemi yok
    4- Interface'ler neyin yapilmasi gerektigini soyler
       ama nasil yapilacagina karismaz

     */

    int SAYI=20;
}
