package day08_ifstaments;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {



    /*
    emeklilik kotrolu yapan bir program yaziniz
    cinsiyet olarak E (erkek) veya K(Kadin) degiskienlerin kabul etsin
    farkli bir harf veya sembol girilirse hata mesaji versin

    emeklilik icin kadinlarda yas siniri 60
    erkeklerde 65 olsun

    negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girip entera basiniz ");
        char gender=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double age=scan.nextDouble();

        if (gender=='E'){
            if (age<0 || age>80){
                System.out.println("Ltufen yasi tekrar giriniz");
            }else if (age<65){
                System.out.println("emekli olamazsin "+(65-age)+" yil kaldi emekliliginize");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }
        }
        else if (gender=='K') {
            if (age < 0 || age > 80) {
                System.out.println("Lutfen gecerli bir sayi giriniz");
            } else if (age < 60) {
                System.out.println("emekli olamazsin " + (60 - age) + " yil kaldi emekliliginize");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
                System.out.println("Lutfen cinsiyetinizi tekrar giriniz");
            }


    }
}