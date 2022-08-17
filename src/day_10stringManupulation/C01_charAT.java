package day_10stringManupulation;

public class C01_charAT {
    public static void main(String[] args) {


        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdirir J

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); // l

      //  System.out.println(str.charAt(22)); // Stringindexoutofboundsexception
      // son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz.
      // eger index olarak uzunlugu veya daha bir sayiyi girersek exception verir


      //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
      //String methodlarindan kullanmamiz gereken bir method varsa
      //charAt() 'den once kullanmaliyiz

    }

}
