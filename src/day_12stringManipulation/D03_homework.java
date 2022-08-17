package day_12stringManipulation;

public class D03_homework {

    public static void main(String[] args) {

        String input = "ibrZhim";

        if (input.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (input.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
    }
}
