package day07_ifStatements;

public class E02_EnglishNestedIfStatement {
    public static void main(String[] args) {
        // if the gender is "Male" and the age is less than 13 print "Boy" other wise print "man" on the console
        // if the gender is "female" and the age is less than 13 print "Girl" other wise print "Woman" on the console
        // if the gender different from "Male and Female" print "No information" on the console

        String gender= "fEmale";
        gender=gender.toLowerCase();
        int age= 100 ;

        if (gender.equals("male")){
            if (age<13){
                System.out.println("boy");
            }else System.out.println("Man");
        }else if (gender.equals("female")){
            if (age<13){
                System.out.println("Girl");
            }else System.out.println("women");
        }else System.out.println("No information");


    }
}
