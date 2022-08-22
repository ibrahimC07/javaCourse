package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);


        buyukHarfleYazdir(liste);
        System.out.println();
        uzunlugaGoreYazdir(liste);
    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.

    //1.yol
    public static void buyukHarfleYazdir(List<String> list){

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //2.yol
    //public static void buyukHarfleYazdir02(List<String> list){
      //  list.replaceAll(String::toUpperCase);
      //  System.out.println(list);

  //  } liste mutable oldugundan dolayi degisiklik kalici olacaktir ondan dolayi yoruma aldik


    // 2) Elemanlari uzunluklarina gore siralayip yazdiran bir method olusturun.

    public static void uzunlugaGoreYazdir(List<String> list){


        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
        //Comparator.comparing : Siralama kosulunu belirtmek icin kullanilir



    }
    //3 Elemanlari uzunluklarina gore ters siralayip yazdiran bir method olusturun
    public static void uzunlugaGoreTersYazdir(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed())
                .forEach(Utils::ayniSatirdaBosluklaYazdir);

    }



}
