package day_12stringManipulation;

public class D02_homework {
    public static void main(String[] args) {


        // asagida verilen ifadenin fiyatlarin toplamini bulunuz?
       /* String str1 = "$13.99";
        String str2 = "$10.55";

        double toplam=Double.parseDouble(str1+str2);
        System.out.println(toplam);

        */
        String str1= "$13.99";
        String str2= "$10.55";
        str1=str1.replace("$", "");
        str2=str2.replace("$", "");
        double a=Double.parseDouble(str1);
        double b=Double.parseDouble(str2);
        System.out.println("$"+(a+b));










    }




}
