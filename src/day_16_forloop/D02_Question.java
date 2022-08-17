package day_16_forloop;

import java.util.Scanner;

public class D02_Question {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<10;i++){
            System.out.println("Enter a number");
            sum = sum+s.nextInt();
        }
        System.out.println("Sum is "+sum);
    }
}
