package day_16_forloop;

import java.time.LocalDateTime;
import java.util.Scanner;

public class E01_Qeustion {
    public static void main(String[] args) {

        // ask user to enter to enter his full name, then create a unique id for the user
        //Id should contain first 2 characters of the first name and last 2 characters of the last name
        // use the current date time at the end of the id
        // example ; Tom Hanks ==> Toks20220528110434

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName=scan.nextLine();

        String adFullName=fullName.substring(0,2)+ fullName.substring(fullName.length()-2);
        LocalDateTime datetiming=LocalDateTime.now();
        String adjustData=datetiming.toString().substring(0,19).replaceAll("[^0-9]","");
        System.out.println(adFullName+adjustData);


    }
}
