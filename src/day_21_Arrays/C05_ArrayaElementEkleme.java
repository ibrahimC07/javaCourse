package day_21_Arrays;

import java.util.Arrays;

public class C05_ArrayaElementEkleme {
    public static void main(String[] args) {

        // soru 5 = Verilen bir array'e yeni bir element ekleyen method olusturun


        String[] sinifListesi = {"Ali Can"};
        String eklenekIsim= "Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenekIsim) {
        String[] yeniSinifListesi = new String [sinifListesi.length+1]; //[null, null]
        // eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
        //oncelikle eski listedeki tum elemanlari, yeni listeye tasidim
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenekIsim;
        // son index'e ise eklenecek isim atadim



        return yeniSinifListesi;

    }
}
