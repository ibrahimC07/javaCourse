package day_10stringManupulation;

public class E01_StringManipulation {
    public static void main(String[] args) {

        String fullName= "   tOM Hanks" ;

        String initialOfFirstName= fullName.trim().substring(0,1).toUpperCase();
        String initialOfLastName= fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(initialOfFirstName+initialOfLastName);

        //example 4: Make the all digits except last 4 of a credit card invisible by using '*'
        //1234 1234 1234 1234 ==> **** **** **** 1234

        String creditCart= "1234 1234 1234 1234" ;

        String invisiblePart = creditCart.substring(0,15).replaceAll("\\S","*")+creditCart.substring(15);
        System.out.println(invisiblePart);

        String s="Tom Hanks was born in 1975." ; // count how many characters different from space were used in a string
        int numOfChars=s.replace(" ","").length();
        System.out.println(numOfChars);

    }
}
