package day04_dataCasting;

public class D03_Odev3 {

    public static void main(String[] args) {


        //soru6)int bir sayiyi double bir sayiya bolun ve sonucu yazdirn

        int number= 15;
        double number2=7.5;
        System.out.println("sonuc :" +number/number2);


        //soru7)Farkli data tipleri ile islem yapip sonucu yazdiralim

        byte sayi=10;
        short sayi1=20;
        int sayi2=30;
        long sayi3=40;
        double sayi4=50;
        System.out.println(sayi/sayi1);
        System.out.println(sayi2*sayi3);
        System.out.println(sayi3-sayi4);
        System.out.println(sayi4/sayi3);

    }
}
