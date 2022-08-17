package recal_day_5;

public class Q02_FoorLoop {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("For ile");
        for (int i = 0; i <256 ; i++) {
            char c = (char) i; // casting yaptik, sayi harf ve karakter
            System.out.println(i + "-> " +c);

        }

        System.out.println("While ile");

        int i =0;




    }
}
