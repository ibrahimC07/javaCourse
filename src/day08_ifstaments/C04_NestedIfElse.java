package day08_ifstaments;

import java.util.Scanner;

public class C04_NestedIfElse {

    public static void main(String[] args) {


        /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e     bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamkli bir sayi giriniz");
        int number=scan.nextInt();

        if (number<1000 || number>9999){
            System.out.println("Lutfen 4 basamakli sayiyi tekrar giriniz");
        }else if (number%5==0){
            if (number%10==0){
                System.out.println("5'e bolunebilen cift sayi");
            }else {
                System.out.println("5'e bolunen teksayi");
            }
        }else {
            System.out.println("Tekrar deneyin");
        }




    }
}
