package day_13_MethodCreation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String str1= "$13.99" ;
        String str2= "$10.55" ;

        // zaten bo soruyu cozmustum

        str1=str1.replace("$","");
        str2=str2.replace("$","");

        double a= Double.parseDouble(str1);
        double b=Double.parseDouble(str2);
        System.out.println("$"+(a+b));


    }
}
