package day_14_methodCreation;

public class C02_MethodCreation {



    public static void main(String[] args) {
        // Verilen uc basamakli bir sayinin
        // rakamlari toplamini yazdiran bir method olusturalim

        int input = 456 ;

        rakamlariToplami(input);
        C01_MethodCreation.terstenYaz("Vedat");

    }

    public static void rakamlariToplami(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input=input/10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input=input/10;

        System.out.println("Verilen "+temp+" sayinin rakamlari toplami :"+rakamlarToplami);




    }

}

