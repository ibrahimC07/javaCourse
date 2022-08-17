package day_10practise.Okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

    public static void main(String[] args) {
        System.out.println("Hos Geldiniz okulumuza ");

        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in); // TODO static
        String isim = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyIsim = scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Bransinizi giriniz");
        String brans= scan.next();

     //   scan.nextLine(); // dummy hayalet komut

        System.out.println("telefon no giriniz");
        String tel=scan.next();


        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyIsim,
                yas,brans, tel);
        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();// TODO static

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }



}

