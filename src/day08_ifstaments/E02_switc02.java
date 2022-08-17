package day08_ifstaments;

public class E02_switc02 {
    public static void main(String[] args) {
        // ask user to enter day number , print all day names starting with the given day name
        //user ==> 5 output ==> Thursday - friday - saturday
        // User==> 3 output ==> Tuesday-Wednesday-Thursday-Friday- saturday
        // the first day is sunday in the USA***

        String day= "8" ;

        switch (day){
            case "1" : System.out.println("sunday");
            case "2" : System.out.println("monday");
            case "3" : System.out.println("tuesday");
            case "4" : System.out.println("wednesday");
            case "5" : System.out.println("thursday");
            case "6" : System.out.println("friday");
            case "7" : System.out.println("saturday"); break;
            default: System.out.println("enter a valid number");

        }
    }
}
