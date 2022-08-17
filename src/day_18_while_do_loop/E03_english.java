package day_18_while_do_loop;

import java.util.Scanner;

public class E03_english {
    public static void main(String[] args) {
       /*
       ask user to enter an integer
       if the integer is less than 100, tell use "Won!"
       Otherwise , tell user "Lost!"
        */
        Scanner input=new Scanner(System.in);


        int i=0;
        do {
            System.out.println("Enter an integer...");
           i=input.nextInt();
           if (i<100){
               System.out.println("Won!");
           }

        }while (i<100);
        System.out.println("Lost!");

        //2.Way
        int k= 0;

        do {
            System.out.println("Enter an integer...");
            k=input.nextInt();
            if (k>99){
                System.out.println("Lost!");
                break;
            }
            System.out.println("Won!");
        }while (true);

    }
}
