package day_18_while_do_loop;

import java.util.Scanner;

public class E04_English {
    public static void main(String[] args) {
        /*
        Username is "admin", Password is "pwd123"
        ask user to enter username and password
        User should see "Enter your username and password" message
        if he enters correct credentials he should get "you are in your account!" message
        Otherwise, he should see "Enter your username and password" message 3 time
        After 3 times he should get "your account is blocked" message


         */

        Scanner input=new Scanner(System.in);

        int counter=0;


        do {

            if (counter==3){
                System.out.println("your account is blocked");
                break;
            }
            System.out.println("Enter username");
            String u = input.next();
            System.out.println("Enter password");
            String p=input.next();
            counter++;

            if (u.equals("admin")&& p.equals("pwd123")){
                System.out.println("you are in your account!");
                break;
            }
        }while (true);
    }
}
