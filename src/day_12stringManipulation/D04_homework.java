package day_12stringManipulation;

public class D04_homework {

    public static void main(String[] args) {

        String isim= "ibrahim";
        String soyisim="celikel";

        int isimu= isim.length();
        int soyisimu= soyisim.length();

        if (isimu>soyisimu){
            System.out.println(isim);
        }else if (soyisimu>isimu){
            System.out.println(soyisim);
        }else {
            System.out.println("uzunluklari birbirine esittir");
        }

    }
}
