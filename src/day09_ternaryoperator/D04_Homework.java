package day09_ternaryoperator;

public class D04_Homework {

    public static void main(String[] args) {

        String input= "SDET harflerinden birini giriniz" ;

        switch (input){

            case "S" :
                System.out.println("Software");
                break;
            case "D" :
                System.out.println("Development");
                break;
            case "E" :
                System.out.println("Engineer");
                break;
            case "t" :
                System.out.println("In testing");
                break;
            default:
                System.out.println("Lutfen gecerli bir harf giriniz");

        }
    }
}
