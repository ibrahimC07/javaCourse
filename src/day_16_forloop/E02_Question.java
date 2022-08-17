package day_16_forloop;

public class E02_Question {
    public static void main(String[] args) {
        // Type "Hi!" on the console 5 time

        String a = "Hi!";
        for (int i = 1; i <= 5; i++) {

            System.out.println(a);
        }

        // example 1 : Type integers from 10 to 3 on the console by using for-loop

        for (int i = 10; i >= 3; i--) {
            System.out.print(i + ",");


        }
        System.out.println("");
        // Type odd integers from 4 to 15 by using for-loop
        for (int i = 5; i <= 15; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ,");
            }

        }

        System.out.println("");
        // Print all integers from 10 to 32 except 17 on the console

        for (int i = 10; i <= 32; i++) {
            if (i != 17) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

        //2.secon way
        for (int i = 10; i <= 32; i++) {
            if (i == 17) {
                continue; // to skip some steps in a loop we use "continue" keyword
            }
            System.out.print(i + " ");
        }
        // example 5: Print String characters one by one on the console. If you see "x" stop printing
        // example: Publix is the best ==> Publi

        System.out.println();
        String str= "Publix is the best";
        for (int i = 0; i <=str.length()-1 ; i++) {
            if (str.charAt(i)=='x'){
                break;
            }
            System.out.print(str.charAt(i));
        }
    }
}