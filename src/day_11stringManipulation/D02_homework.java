package day_11stringManipulation;

public class D02_homework {

    public static void main(String[] args) {

        String input= "Java ile hayat hayat guzel";
        String kelime= "fd";

        int ilkkelime= input.indexOf(kelime);
        int sonkelime=input.lastIndexOf(kelime);



        if (!input.contains(kelime)){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if (ilkkelime==sonkelime){

            System.out.println("kelime cumlede sadece bir kez kullanilmistir");
        }else {
            System.out.println("birden fazla kullanilmistir");

        }
    }
}
