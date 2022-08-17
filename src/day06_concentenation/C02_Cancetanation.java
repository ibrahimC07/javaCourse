package day06_concentenation;

public class C02_Cancetanation {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzeldir";
        int sayi1=5;
        int sayi2=4;

         // yularidaki variabler'lari kullanarak istenen metinleri yazdiralim
        System.out.println(str1+" "+str2+" "+sayi1+sayi2);  // Java Guzeldir 54

        System.out.println(str1+" "+str2+" "+ (sayi1+sayi2));
        System.out.println((sayi1+sayi2)+" "+str1); // 9 Java
        System.out.println(""+sayi1+sayi2+" "+str2); // 54 guzeldir

        System.out.println(str1.concat(str2)); //JavaGuzeldir // concat ozelligi cok kullanilmaz.
        System.out.println(str1.concat(" ").concat(str2));

    }

}
