package day_16_forloop;

import java.util.Scanner;

public class E06_Question {
    public static void main(String[] args) {

        // ask the user how many fibonacci numbers he wants to see.
        //then write the code that prints these fibonacci numbers
        //example: if user enters 6 output will be 1 1 2 3 5 8

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers to see");
        int n = scan.nextInt();

        int fibo1=1;
        int fibo2=1;
        int fibonacci=0;


        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");

        for (int i = 1; i <n-1 ; i++) {
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.print(fibonacci+ " ");
        }


    }
}
