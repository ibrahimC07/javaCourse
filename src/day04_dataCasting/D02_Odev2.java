package day04_dataCasting;

public class D02_Odev2 {


    public static void main(String[] args) {

        //soru2)int veri turunde bir degisken olusturun ve adim adim norrowing yapip yazdirin

        int number1=100;
        short number2= (short) number1;
        byte number3= (byte) number2;


        System.out.println("byte norrowing :" + number3);

        //soru3)Float data turunde bir variable olusturun ve yazdirin


        float number4= 155f;

        System.out.println(number4);


        //soru4)double 255.36 sayisini int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin


        float number5= 255.36f;
        int number6=(int) number5;
        byte number7=(byte)number6;
        System.out.println("byte norrowing :" +number7);


        //soru5)int 2 sayiyi birbirine boldurun ve yazdirin

        int sayi1=10;
        int sayi=20;
        System.out.println("sonuc :" + sayi1/sayi);




    }
}
