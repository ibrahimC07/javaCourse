package day06_concentenation;

public class C01_WrapperClass {


    public static void main(String[] args) {

        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir
         */

        String str="Java Cok guzel";
        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT NE GUZEL

        boolean guzelMi= true;

        // guzelMi. boolean primitive oldugundan hazir methodu bulunmuyor
        int sayi=10;
        // primitive data turlerinin yaninda method'lar olmaz
        // java bazi method'lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper class olusturmustur.
        Integer sayi2=10;
        sayi2.byteValue();

    }
}
