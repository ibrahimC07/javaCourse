package day04_dataCasting;

public class D01_Odev {


    public static void main(String[] args) {

     /*
    soru1) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
    birer degisken olusturup adim adim widening yapin ve yazdirin
     */
         byte number1= 10;
         short number2=number1;
        System.out.println("short widening :" + number2);
        int number3=number2;
        float number4=number3;
        double number5=number4;
        System.out.println("double widening" + number5);



    }

}
