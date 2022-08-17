package day09_ternaryoperator;

public class D03_Homework3 {

    public static void main(String[] args) {

        String input= "10" ;

        switch (input){

            case "10" :
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case "100" :
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case "1000":
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Lutfen girdiginiz sayiyi degistiriniz");
        }
    }

}
