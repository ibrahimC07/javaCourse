package day_12stringManipulation;

public class D01_homework {
    public static void main(String[] args) {


        String str=" Java ogrenmek123 Cok guzel@ ";

       // System.out.println(str.replace(" Java ogrenmek123 Cok guzel@ ", "Java ogrenmek cok guzel"));
        str=str.trim();
        str=str.replace(" ", "asdf");

        str=str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");
        str=str.replace("asdf"," ");
        str=str+".";
        System.out.println(str);





    }
}
