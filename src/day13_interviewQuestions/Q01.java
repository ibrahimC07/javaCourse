package day13_interviewQuestions;

import java.util.Scanner;

public class Q01 {

    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        armtrong(sayi);
        GirilenSayiyaKadarOlanArmstrongSayilar(sayi);



    }

    private static void GirilenSayiyaKadarOlanArmstrongSayilar(int sayi) {
        for (int i = 1; i <=sayi ; i++) {
            armtrong(i);

        }
    }

    private static void armtrong(int sayi) {
        int sayininKuplerToplami=0;
        int basamaktakiSayi = 0;
        int girilenSayi=sayi;

        while (sayi>0){
            basamaktakiSayi=sayi%10;
            sayininKuplerToplami+= (basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi/=10;
        }

        if (sayininKuplerToplami==girilenSayi){
            System.out.println("sayi armstrong sayidir :" + girilenSayi);
        }else System.out.println("sayi armstrong sayi degldir :"+girilenSayi);

    }


}


