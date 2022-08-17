package recal_day_08;

import java.util.Arrays;
import java.util.Scanner;

public class C02_StringHavuzu {
/*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
public static void main(String[] args) {

    arrayOlustur();


}

    private static void arrayOlustur() {

    Scanner scanner= new Scanner(System.in);
        System.out.println("array uzunlugunu giriniz :");
        int uzunluk = scanner.nextInt();
        int [] arr = new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin " + (i+1)+ ". elemanini giriniz :"); // i=> oldugunda 0. eleman denileceg icin direkt eleman sorduk
            arr[i]=scanner.nextInt(); // fori'den gelen indexler
        }

        Arrays.sort(arr);
        System.out.println("Arraydeki en buyuk ile en kucuk eleman arasindaki fark : " + (arr[uzunluk-1]-arr[0]));


        /*
        odev : bu soruyu MAth classi ile cozunuz
         */


    }
}
