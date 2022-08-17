package day09_ternaryoperator;

public class D01_Homework1 {
    public static void main(String[] args) {

        String input= "cumartesi" ;

        switch (input){
            case "pazartesi" :
            case "sali"      :
            case "carsamba"  :
            case "persembe"  :
            case "cuma"      :
                System.out.println("hafta ici");
                break ;
            case "cumartesi" :
            case "pazar"     :
                System.out.println("Hafta sonu");
                break ;
            default:
                System.out.println("tekrar deneyiniz");

        }

    }

}
